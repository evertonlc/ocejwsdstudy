package org.econfortin.ocejwsdstudy.by.boot.java.message.context;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class TestClient {

    private static final String Namespace = "http://context.message.java.boot.by.ocejwsdstudy.econfortin.org/";
    private static final String EscapedNamespace = "\'http://context.message.java.boot.by.ocejwsdstudy.econfortin.org/\'";

    public static void main(String[] args) throws Exception {
        URL url;
        try {
            url = new URL("http://localhost:9002/test?wsdl");
            QName serviceName = new QName(Namespace, "TestService");   //Nome do service + Service
            QName portName = new QName(Namespace, "TestPort");         //Nome do service + Port
            Service service = Service.create(url, serviceName);
            Dispatch<Source> dispatch = service.createDispatch(portName, Source.class, Service.Mode.PAYLOAD);
            Source response = dispatch.invoke(createContent());
        } catch (MalformedURLException e) {
        }
    }

    private static Source createContent() throws SOAPException {
        String p = "<ns2:reverse xmlns:ns2=" + EscapedNamespace + "><arg0>minha string</arg0></ns2:reverse>";
        return new StreamSource(new ByteArrayInputStream(p.getBytes()));
    }
}
