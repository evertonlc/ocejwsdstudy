package org.econfortin.ocejwsdstudy.enthuware.trial.q08;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DispatchSoapMessageClient {
    private static final String Namespace = "http://q08.trial.enthuware.ocejwsdstudy.econfortin.org/";
    private static final String EscapedNamespace = "\'http://q08.trial.enthuware.ocejwsdstudy.econfortin.org/\'";

    public static void main(String[] args) throws Exception {
        URL url;
        try {
            url = new URL("http://localhost:9999/math?wsdl");
            QName serviceName = new QName(Namespace, "MathTableImplService");   //Nome do service + Service
            QName portName = new QName(Namespace, "MathTableImplPort");         //Nome do service + Port
            Service service = Service.create(url, serviceName);
            /*
             * Source - Passa a parte interna da mensagem, neste caso devemos usar modo PAYLOAD
             * SOAPMessage - Passa a mensagem completa, neste caso devemos usar o modo MESSAGE
             */
            Dispatch<Source> dispatch = service.createDispatch(portName, Source.class, Service.Mode.PAYLOAD);
            //Dispatch<SOAPMessage> dispatchMessage = service.createDispatch(portName, SOAPMessage.class, Service.Mode.MESSAGE);    //Forma também correta, só que passando a mensagem completa
            Source response = dispatch.invoke(createContent());
            System.out.println(response);
        } catch (MalformedURLException e) {
        }
    }

    /*
     * Cria a parte interna da mensagem SOAP, note que estamos invocando o método getTable
     */
    private static Source createContent() throws SOAPException {
        String p = "<ns2:getTable xmlns:ns2=" + EscapedNamespace + "><arg0>5</arg0></ns2:getTable>";
        return new StreamSource(new ByteArrayInputStream(p.getBytes()));
    }
}
