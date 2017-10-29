
package org.econfortin.ocejwsdstudy.enthuware.test1.q36;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.econfortin.ocejwsdstudy.enthuware.test1.q36 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Log_QNAME = new QName("http://q36.test1.enthuware.ocejwsdstudy.econfortin.org/", "log");
    private final static QName _LogResponse_QNAME = new QName("http://q36.test1.enthuware.ocejwsdstudy.econfortin.org/", "logResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.econfortin.ocejwsdstudy.enthuware.test1.q36
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LogResponse }
     * 
     */
    public LogResponse createLogResponse() {
        return new LogResponse();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://q36.test1.enthuware.ocejwsdstudy.econfortin.org/", name = "log")
    public JAXBElement<Log> createLog(Log value) {
        return new JAXBElement<Log>(_Log_QNAME, Log.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://q36.test1.enthuware.ocejwsdstudy.econfortin.org/", name = "logResponse")
    public JAXBElement<LogResponse> createLogResponse(LogResponse value) {
        return new JAXBElement<LogResponse>(_LogResponse_QNAME, LogResponse.class, null, value);
    }

}
