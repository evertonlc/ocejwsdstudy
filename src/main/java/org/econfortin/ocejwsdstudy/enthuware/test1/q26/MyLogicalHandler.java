package org.econfortin.ocejwsdstudy.enthuware.test1.q26;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.MessageContext;

/*
 * Deve implementar o javax.xml.ws.handler.LogicalHandler
 */
public class MyLogicalHandler implements LogicalHandler {

    @Override
    public boolean handleMessage(MessageContext context) {
        System.out.println("Tratando o Logical Handler" + context.entrySet());
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
