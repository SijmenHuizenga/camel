/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.jms.issues;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.CamelJmsTestHelper;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

import static org.apache.camel.component.jms.JmsComponent.jmsComponentAutoAcknowledge;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JmsInOnlyIssueTest extends CamelTestSupport {

    @Test
    public void testInOnlyWithSendBody() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Bye World");

        template.sendBody("activemq:queue:in", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testInOnlyWithAsyncSendBody() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Bye World");

        // need a little sleep to let task exectuor be ready
        Thread.sleep(1000);

        template.asyncSendBody("activemq:queue:in", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testInOnlyWithSendExchange() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Bye World");

        Exchange out = template.send("activemq:queue:in", ExchangePattern.InOnly,
                exchange -> exchange.getIn().setBody("Hello World"));

        assertMockEndpointsSatisfied();
        /*
          The getMessage returns the In message if the Out one is not present. Therefore, we check if
          the body of the returned message equals to the In one and infer that the out one was null.
         */
        assertEquals("Hello World", out.getMessage().getBody(), "There shouldn't be an out message");
    }

    @Test
    public void testInOnlyWithAsyncSendExchange() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Bye World");

        // need a little sleep to let task exectuor be ready
        Thread.sleep(1000);

        template.asyncSend("activemq:queue:in", exchange -> {
            exchange.setPattern(ExchangePattern.InOnly);
            exchange.getIn().setBody("Hello World");
        });

        assertMockEndpointsSatisfied();
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();
        ConnectionFactory connectionFactory = CamelJmsTestHelper.createConnectionFactory();
        camelContext.addComponent("activemq", jmsComponentAutoAcknowledge(connectionFactory));
        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("activemq:queue:in").process(exchange -> exchange.getIn().setBody("Bye World")).to("mock:result");
            }
        };
    }

}
