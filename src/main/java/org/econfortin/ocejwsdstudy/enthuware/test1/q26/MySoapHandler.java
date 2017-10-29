package org.econfortin.ocejwsdstudy.enthuware.test1.q26;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import java.util.Set;
/*
 * Deve implementar o javax.xml.ws.handler.soap.SOAPHandler
 */
public class MySoapHandler implements SOAPHandler {
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public boolean handleMessage(MessageContext context) {
        System.out.println("Tratando o SOAP Handler" + context.entrySet());
        return true;    //Para continuar o chain
    }

    @Override
    public boolean handleFault(MessageContext context) {
        return false;
    }

    @Override
    public void close(MessageContext context) {

    }
}
