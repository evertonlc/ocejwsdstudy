
package org.econfortin.ocejwsdstudy.by.boot.ch06s02;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "Catalog", targetNamespace = "http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Catalog {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getTitle", targetNamespace = "http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/", className = "GetTitle")
    @ResponseWrapper(localName = "getTitleResponse", targetNamespace = "http://ch06s02.java.boot.by.ocejwsdstudy.econfortin.org/", className = "GetTitleResponse")
    public String getTitle(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
