/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter.jaxp;

import org.apache.camel.*;
import org.apache.camel.spi.BulkTypeConverters;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public final class CamelXmlJaxpBulkConverterLoader implements TypeConverterLoader, BulkTypeConverters {

    public CamelXmlJaxpBulkConverterLoader() {
    }

    @Override
    public int size() {
        return 92;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registry.addBulkTypeConverters(this);
    }

    @Override
    public <T> T convertTo(Class<?> from, Class<T> to, Exchange exchange, Object value) throws TypeConversionException {
        try {
            Object obj = doConvertTo(from, to, exchange, value);
            if (obj == Void.class) {;
                return null;
            } else {
                return (T) obj;
            }
        } catch (TypeConversionException e) {
            throw e;
        } catch (Exception e) {
            throw new TypeConversionException(value, to, e);
        }
    }

    private Object doConvertTo(Class<?> from, Class<?> to, Exchange exchange, Object value) throws Exception {
        if (to == byte[].class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return getDomConverter().toByteArray((org.w3c.dom.NodeList) value, exchange);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toByteArray((javax.xml.transform.Source) value, exchange);
            }
        } else if (to == java.io.InputStream.class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return getDomConverter().toInputStream((org.w3c.dom.NodeList) value, exchange);
            }
            if (value instanceof javax.xml.stream.XMLStreamReader) {
                return getStaxConverter().createInputStream((javax.xml.stream.XMLStreamReader) value, exchange);
            }
            if (value instanceof javax.xml.transform.dom.DOMSource) {
                return getXmlConverter().toInputStream((javax.xml.transform.dom.DOMSource) value, exchange);
            }
            if (value instanceof org.w3c.dom.Document) {
                return getXmlConverter().toInputStream((org.w3c.dom.Document) value, exchange);
            }
            if (value instanceof javax.xml.transform.stream.StreamSource) {
                return getXmlConverter().toInputStream((javax.xml.transform.stream.StreamSource) value);
            }
        } else if (to == java.io.Reader.class) {
            if (value instanceof javax.xml.stream.XMLStreamReader) {
                return getStaxConverter().createReader((javax.xml.stream.XMLStreamReader) value, exchange);
            }
            if (value instanceof javax.xml.transform.stream.StreamSource) {
                return getXmlConverter().toReader((javax.xml.transform.stream.StreamSource) value);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toReaderFromSource((javax.xml.transform.Source) value, exchange);
            }
        } else if (to == java.io.Serializable.class) {
            if (value instanceof org.apache.camel.StreamCache) {
                return org.apache.camel.util.xml.StreamSourceConverter.convertToSerializable((org.apache.camel.StreamCache) value, exchange);
            }
        } else if (to == java.lang.Boolean.class || to == boolean.class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return getXmlConverter().toBoolean((org.w3c.dom.NodeList) value);
            }
        } else if (to == java.lang.Integer.class || to == int.class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return org.apache.camel.converter.jaxp.DomConverter.toInteger((org.w3c.dom.NodeList) value);
            }
        } else if (to == java.lang.Long.class || to == long.class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return org.apache.camel.converter.jaxp.DomConverter.toLong((org.w3c.dom.NodeList) value);
            }
        } else if (to == java.lang.String.class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return getDomConverter().toString((org.w3c.dom.NodeList) value, exchange);
            }
            if (value instanceof org.w3c.dom.Node) {
                return getDomConverter().toString((org.w3c.dom.Node) value, exchange);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toString((javax.xml.transform.Source) value, exchange);
            }
        } else if (to == java.util.List.class) {
            if (value instanceof org.w3c.dom.NodeList) {
                return org.apache.camel.converter.jaxp.DomConverter.toList((org.w3c.dom.NodeList) value);
            }
        } else if (to == javax.xml.namespace.QName.class) {
            if (value instanceof java.lang.String) {
                return getXmlConverter().toQName((java.lang.String) value);
            }
        } else if (to == javax.xml.stream.XMLEventReader.class) {
            if (value instanceof java.io.InputStream) {
                return getStaxConverter().createXMLEventReader((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getStaxConverter().createXMLEventReader((java.io.File) value, exchange);
            }
            if (value instanceof java.io.Reader) {
                return getStaxConverter().createXMLEventReader((java.io.Reader) value);
            }
            if (value instanceof javax.xml.stream.XMLStreamReader) {
                return getStaxConverter().createXMLEventReader((javax.xml.stream.XMLStreamReader) value);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getStaxConverter().createXMLEventReader((javax.xml.transform.Source) value);
            }
        } else if (to == javax.xml.stream.XMLEventWriter.class) {
            if (value instanceof java.io.OutputStream) {
                return getStaxConverter().createXMLEventWriter((java.io.OutputStream) value, exchange);
            }
            if (value instanceof java.io.Writer) {
                return getStaxConverter().createXMLEventWriter((java.io.Writer) value);
            }
            if (value instanceof javax.xml.transform.Result) {
                return getStaxConverter().createXMLEventWriter((javax.xml.transform.Result) value);
            }
        } else if (to == javax.xml.stream.XMLStreamReader.class) {
            if (value instanceof java.io.InputStream) {
                return getStaxConverter().createXMLStreamReader((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getStaxConverter().createXMLStreamReader((java.io.File) value, exchange);
            }
            if (value instanceof java.io.Reader) {
                return getStaxConverter().createXMLStreamReader((java.io.Reader) value);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getStaxConverter().createXMLStreamReader((javax.xml.transform.Source) value);
            }
            if (value instanceof java.lang.String) {
                return getStaxConverter().createXMLStreamReader((java.lang.String) value);
            }
        } else if (to == javax.xml.stream.XMLStreamWriter.class) {
            if (value instanceof java.io.OutputStream) {
                return getStaxConverter().createXMLStreamWriter((java.io.OutputStream) value, exchange);
            }
            if (value instanceof java.io.Writer) {
                return getStaxConverter().createXMLStreamWriter((java.io.Writer) value);
            }
            if (value instanceof javax.xml.transform.Result) {
                return getStaxConverter().createXMLStreamWriter((javax.xml.transform.Result) value);
            }
        } else if (to == javax.xml.transform.Source.class) {
            if (value instanceof java.lang.String) {
                return getXmlConverter().toSource((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return getXmlConverter().toSource((byte[]) value);
            }
            if (value instanceof org.w3c.dom.Document) {
                return getXmlConverter().toSource((org.w3c.dom.Document) value);
            }
        } else if (to == javax.xml.transform.dom.DOMSource.class) {
            if (value instanceof org.w3c.dom.Document) {
                return getXmlConverter().toDOMSource((org.w3c.dom.Document) value);
            }
            if (value instanceof org.w3c.dom.Node) {
                return getXmlConverter().toDOMSource((org.w3c.dom.Node) value);
            }
            if (value instanceof java.lang.String) {
                return getXmlConverter().toDOMSource((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return getXmlConverter().toDOMSource((byte[]) value);
            }
            if (value instanceof java.io.InputStream) {
                return getXmlConverter().toDOMSource((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getXmlConverter().toDOMSource((java.io.File) value, exchange);
            }
            if (value instanceof javax.xml.transform.stream.StreamSource) {
                return getXmlConverter().toDOMSourceFromStream((javax.xml.transform.stream.StreamSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.sax.SAXSource) {
                return getXmlConverter().toDOMSourceFromSAX((javax.xml.transform.sax.SAXSource) value);
            }
            if (value instanceof javax.xml.transform.stax.StAXSource) {
                return getXmlConverter().toDOMSourceFromStAX((javax.xml.transform.stax.StAXSource) value);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toDOMSource((javax.xml.transform.Source) value, exchange);
            }
        } else if (to == javax.xml.transform.sax.SAXSource.class) {
            if (value instanceof java.lang.String) {
                return getXmlConverter().toSAXSource((java.lang.String) value, exchange);
            }
            if (value instanceof java.io.InputStream) {
                return getXmlConverter().toSAXSource((java.io.InputStream) value, exchange);
            }
            if (value instanceof byte[]) {
                return getXmlConverter().toSAXSource((byte[]) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getXmlConverter().toSAXSource((java.io.File) value, exchange);
            }
            if (value instanceof javax.xml.transform.stream.StreamSource) {
                return getXmlConverter().toSAXSourceFromStream((javax.xml.transform.stream.StreamSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.dom.DOMSource) {
                return getXmlConverter().toSAXSourceFromDOM((javax.xml.transform.dom.DOMSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.stax.StAXSource) {
                return getXmlConverter().toSAXSourceFromStAX((javax.xml.transform.stax.StAXSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toSAXSource((javax.xml.transform.Source) value, exchange);
            }
        } else if (to == javax.xml.transform.stax.StAXSource.class) {
            if (value instanceof java.lang.String) {
                return getXmlConverter().toStAXSource((java.lang.String) value, exchange);
            }
            if (value instanceof byte[]) {
                return getXmlConverter().toStAXSource((byte[]) value, exchange);
            }
            if (value instanceof java.io.InputStream) {
                return getXmlConverter().toStAXSource((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getXmlConverter().toStAXSource((java.io.File) value, exchange);
            }
        } else if (to == javax.xml.transform.stream.StreamSource.class) {
            if (value instanceof java.lang.String) {
                return getXmlConverter().toStreamSource((java.lang.String) value);
            }
            if (value instanceof java.io.InputStream) {
                return getXmlConverter().toStreamSource((java.io.InputStream) value);
            }
            if (value instanceof java.io.Reader) {
                return getXmlConverter().toStreamSource((java.io.Reader) value);
            }
            if (value instanceof java.io.File) {
                return getXmlConverter().toStreamSource((java.io.File) value);
            }
            if (value instanceof byte[]) {
                return getXmlConverter().toStreamSource((byte[]) value, exchange);
            }
            if (value instanceof java.nio.ByteBuffer) {
                return getXmlConverter().toStreamSource((java.nio.ByteBuffer) value, exchange);
            }
            if (value instanceof javax.xml.transform.sax.SAXSource) {
                return getXmlConverter().toStreamSourceFromSAX((javax.xml.transform.sax.SAXSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.dom.DOMSource) {
                return getXmlConverter().toStreamSourceFromDOM((javax.xml.transform.dom.DOMSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.stax.StAXSource) {
                return getXmlConverter().toStreamSourceFromStAX((javax.xml.transform.stax.StAXSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toStreamSource((javax.xml.transform.Source) value, exchange);
            }
        } else if (to == org.apache.camel.StreamCache.class) {
            if (value instanceof org.apache.camel.util.xml.BytesSource) {
                return org.apache.camel.util.xml.StreamSourceConverter.convertToStreamCache((org.apache.camel.util.xml.BytesSource) value);
            }
            if (value instanceof javax.xml.transform.stream.StreamSource) {
                return org.apache.camel.util.xml.StreamSourceConverter.convertToStreamCache((javax.xml.transform.stream.StreamSource) value, exchange);
            }
            if (value instanceof javax.xml.transform.sax.SAXSource) {
                return org.apache.camel.util.xml.StreamSourceConverter.convertToStreamCache((javax.xml.transform.sax.SAXSource) value, exchange);
            }
        } else if (to == org.apache.camel.util.xml.BytesSource.class) {
            if (value instanceof byte[]) {
                return getXmlConverter().toBytesSource((byte[]) value);
            }
        } else if (to == org.apache.camel.util.xml.StringSource.class) {
            if (value instanceof java.lang.String) {
                return getXmlConverter().toStringSource((java.lang.String) value);
            }
        } else if (to == org.w3c.dom.Document.class) {
            if (value instanceof org.w3c.dom.Node) {
                return getXmlConverter().toDOMDocument((org.w3c.dom.Node) value);
            }
            if (value instanceof byte[]) {
                return getXmlConverter().toDOMDocument((byte[]) value, exchange);
            }
            if (value instanceof java.io.InputStream) {
                return getXmlConverter().toDOMDocument((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.Reader) {
                return getXmlConverter().toDOMDocument((java.io.Reader) value, exchange);
            }
            if (value instanceof org.xml.sax.InputSource) {
                return getXmlConverter().toDOMDocument((org.xml.sax.InputSource) value, exchange);
            }
            if (value instanceof java.lang.String) {
                return getXmlConverter().toDOMDocument((java.lang.String) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getXmlConverter().toDOMDocument((java.io.File) value, exchange);
            }
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toDOMDocument((javax.xml.transform.Source) value);
            }
            if (value instanceof org.w3c.dom.NodeList) {
                Object obj = getXmlConverter().toDOMDocumentFromSingleNodeList((org.w3c.dom.NodeList) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
        } else if (to == org.w3c.dom.Element.class) {
            if (value instanceof javax.xml.transform.Source) {
                return getXmlConverter().toDOMElement((javax.xml.transform.Source) value);
            }
            if (value instanceof org.w3c.dom.Node) {
                return getXmlConverter().toDOMElement((org.w3c.dom.Node) value);
            }
        } else if (to == org.w3c.dom.Node.class) {
            if (value instanceof javax.xml.transform.sax.SAXSource) {
                return getXmlConverter().toDOMNodeFromSAX((javax.xml.transform.sax.SAXSource) value);
            }
            if (value instanceof javax.xml.transform.stax.StAXSource) {
                return getXmlConverter().toDOMNodeFromStAX((javax.xml.transform.stax.StAXSource) value);
            }
            if (value instanceof org.w3c.dom.NodeList) {
                Object obj = getXmlConverter().toDOMNodeFromSingleNodeList((org.w3c.dom.NodeList) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
            if (value instanceof javax.xml.transform.Source) {
                Object obj = getXmlConverter().toDOMNode((javax.xml.transform.Source) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
        } else if (to == org.xml.sax.InputSource.class) {
            if (value instanceof java.io.InputStream) {
                return getXmlConverter().toInputSource((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.File) {
                return getXmlConverter().toInputSource((java.io.File) value, exchange);
            }
        }
        return null;
    }

    public TypeConverter lookup(Class<?> to, Class<?> from) {
        if (to == byte[].class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == java.io.InputStream.class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
            if (from == javax.xml.stream.XMLStreamReader.class) {
                return this;
            }
            if (from == javax.xml.transform.dom.DOMSource.class) {
                return this;
            }
            if (from == org.w3c.dom.Document.class) {
                return this;
            }
            if (from == javax.xml.transform.stream.StreamSource.class) {
                return this;
            }
        } else if (to == java.io.Reader.class) {
            if (from == javax.xml.stream.XMLStreamReader.class) {
                return this;
            }
            if (from == javax.xml.transform.stream.StreamSource.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == java.io.Serializable.class) {
            if (from == org.apache.camel.StreamCache.class) {
                return this;
            }
        } else if (to == java.lang.Boolean.class || to == boolean.class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
        } else if (to == java.lang.Integer.class || to == int.class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
        } else if (to == java.lang.Long.class || to == long.class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
        } else if (to == java.lang.String.class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
            if (from == org.w3c.dom.Node.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == java.util.List.class) {
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
        } else if (to == javax.xml.namespace.QName.class) {
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == javax.xml.stream.XMLEventReader.class) {
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
            if (from == javax.xml.stream.XMLStreamReader.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == javax.xml.stream.XMLEventWriter.class) {
            if (from == java.io.OutputStream.class) {
                return this;
            }
            if (from == java.io.Writer.class) {
                return this;
            }
            if (from == javax.xml.transform.Result.class) {
                return this;
            }
        } else if (to == javax.xml.stream.XMLStreamReader.class) {
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == javax.xml.stream.XMLStreamWriter.class) {
            if (from == java.io.OutputStream.class) {
                return this;
            }
            if (from == java.io.Writer.class) {
                return this;
            }
            if (from == javax.xml.transform.Result.class) {
                return this;
            }
        } else if (to == javax.xml.transform.Source.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == org.w3c.dom.Document.class) {
                return this;
            }
        } else if (to == javax.xml.transform.dom.DOMSource.class) {
            if (from == org.w3c.dom.Document.class) {
                return this;
            }
            if (from == org.w3c.dom.Node.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == javax.xml.transform.stream.StreamSource.class) {
                return this;
            }
            if (from == javax.xml.transform.sax.SAXSource.class) {
                return this;
            }
            if (from == javax.xml.transform.stax.StAXSource.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == javax.xml.transform.sax.SAXSource.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == javax.xml.transform.stream.StreamSource.class) {
                return this;
            }
            if (from == javax.xml.transform.dom.DOMSource.class) {
                return this;
            }
            if (from == javax.xml.transform.stax.StAXSource.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == javax.xml.transform.stax.StAXSource.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
        } else if (to == javax.xml.transform.stream.StreamSource.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.nio.ByteBuffer.class) {
                return this;
            }
            if (from == javax.xml.transform.sax.SAXSource.class) {
                return this;
            }
            if (from == javax.xml.transform.dom.DOMSource.class) {
                return this;
            }
            if (from == javax.xml.transform.stax.StAXSource.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == org.apache.camel.StreamCache.class) {
            if (from == org.apache.camel.util.xml.BytesSource.class) {
                return this;
            }
            if (from == javax.xml.transform.stream.StreamSource.class) {
                return this;
            }
            if (from == javax.xml.transform.sax.SAXSource.class) {
                return this;
            }
        } else if (to == org.apache.camel.util.xml.BytesSource.class) {
            if (from == byte[].class) {
                return this;
            }
        } else if (to == org.apache.camel.util.xml.StringSource.class) {
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == org.w3c.dom.Document.class) {
            if (from == org.w3c.dom.Node.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
            if (from == org.xml.sax.InputSource.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
        } else if (to == org.w3c.dom.Element.class) {
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
            if (from == org.w3c.dom.Node.class) {
                return this;
            }
        } else if (to == org.w3c.dom.Node.class) {
            if (from == javax.xml.transform.sax.SAXSource.class) {
                return this;
            }
            if (from == javax.xml.transform.stax.StAXSource.class) {
                return this;
            }
            if (from == org.w3c.dom.NodeList.class) {
                return this;
            }
            if (from == javax.xml.transform.Source.class) {
                return this;
            }
        } else if (to == org.xml.sax.InputSource.class) {
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
        }
        return null;
    }

    private volatile org.apache.camel.converter.jaxp.DomConverter domConverter;
    private org.apache.camel.converter.jaxp.DomConverter getDomConverter() {
        if (domConverter == null) {
            domConverter = new org.apache.camel.converter.jaxp.DomConverter();
        }
        return domConverter;
    }
    private volatile org.apache.camel.converter.jaxp.XmlConverter xmlConverter;
    private org.apache.camel.converter.jaxp.XmlConverter getXmlConverter() {
        if (xmlConverter == null) {
            xmlConverter = new org.apache.camel.converter.jaxp.XmlConverter();
        }
        return xmlConverter;
    }
    private volatile org.apache.camel.converter.jaxp.StaxConverter staxConverter;
    private org.apache.camel.converter.jaxp.StaxConverter getStaxConverter() {
        if (staxConverter == null) {
            staxConverter = new org.apache.camel.converter.jaxp.StaxConverter();
            CamelContextAware.trySetCamelContext(staxConverter, camelContext);
        }
        return staxConverter;
    }
}
