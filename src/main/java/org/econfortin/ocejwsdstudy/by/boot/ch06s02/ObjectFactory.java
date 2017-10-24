
package org.econfortin.ocejwsdstudy.by.boot.ch06s02;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.econfortin.ocejwsdstudy.by.boot.java.message.context.ch06s02 package. 
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

    private final static QName _GetTitleResponse_QNAME = new QName("http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/", "getTitleResponse");
    private final static QName _GetTitle_QNAME = new QName("http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/", "getTitle");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.econfortin.ocejwsdstudy.by.boot.java.message.context.ch06s02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTitleResponse }
     * 
     */
    public GetTitleResponse createGetTitleResponse() {
        return new GetTitleResponse();
    }

    /**
     * Create an instance of {@link GetTitle }
     * 
     */
    public GetTitle createGetTitle() {
        return new GetTitle();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitleResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/", name = "getTitleResponse")
    public JAXBElement<GetTitleResponse> createGetTitleResponse(GetTitleResponse value) {
        return new JAXBElement<GetTitleResponse>(_GetTitleResponse_QNAME, GetTitleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTitle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/", name = "getTitle")
    public JAXBElement<GetTitle> createGetTitle(GetTitle value) {
        return new JAXBElement<GetTitle>(_GetTitle_QNAME, GetTitle.class, null, value);
    }

}
