/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elsql;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class ElsqlEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":elsqlName:resourceUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(49);
        props.add("allowNamedParameters");
        props.add("alwaysPopulateStatement");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("batch");
        props.add("breakBatchOnConsumeFail");
        props.add("bridgeErrorHandler");
        props.add("dataSource");
        props.add("databaseVendor");
        props.add("delay");
        props.add("elSqlConfig");
        props.add("elsqlName");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("expectedUpdateCount");
        props.add("greedy");
        props.add("initialDelay");
        props.add("lazyStartProducer");
        props.add("maxMessagesPerPoll");
        props.add("noop");
        props.add("onConsume");
        props.add("onConsumeBatchComplete");
        props.add("onConsumeFailed");
        props.add("outputClass");
        props.add("outputHeader");
        props.add("outputType");
        props.add("parametersCount");
        props.add("placeholder");
        props.add("pollStrategy");
        props.add("prepareStatementStrategy");
        props.add("processingStrategy");
        props.add("repeatCount");
        props.add("resourceUri");
        props.add("routeEmptyResultSet");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("sendEmptyMessageWhenIdle");
        props.add("separator");
        props.add("startScheduler");
        props.add("templateOptions");
        props.add("timeUnit");
        props.add("transacted");
        props.add("useFixedDelay");
        props.add("useIterator");
        props.add("useMessageBodyForSql");
        props.add("usePlaceholder");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(2);
        prefixes.add("scheduler.");
        prefixes.add("template.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "elsql".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "elsqlName", null, true, copy);
        uri = buildPathParameter(syntax, uri, "resourceUri", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

