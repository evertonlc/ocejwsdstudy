package org.econfortin.ocejwsdstudy.by.boot.ch11s01;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.MTOM;
import javax.xml.ws.soap.SOAPBinding;

@MTOM(enabled = true)
@WebService(name="MtomPortType",
    serviceName="MtomService",
    targetNamespace="http://example.org")
@BindingType(value = SOAPBinding.SOAP11HTTP_MTOM_BINDING)
public class MTOMImpl {
    @WebMethod
    public String echoBinaryAsString(byte[] bytes) {
        return new String(bytes);
    }
}
