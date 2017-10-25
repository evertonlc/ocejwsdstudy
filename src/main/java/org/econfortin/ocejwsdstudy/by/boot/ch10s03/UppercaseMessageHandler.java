package org.econfortin.ocejwsdstudy.by.boot.ch10s03;

import org.econfortin.ocejwsdstudy.by.boot.ch06s02.GetTitleResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.ws.LogicalMessage;
import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

public class UppercaseMessageHandler implements LogicalHandler<LogicalMessageContext> {

    public boolean handleMessage(LogicalMessageContext ctx) {
        String outboundProp = MessageContext.MESSAGE_OUTBOUND_PROPERTY;
        boolean outbound = (Boolean) ctx.get(outboundProp);
        if (outbound) {
            try {
                LogicalMessage message = ctx.getMessage();

                JAXBContext context = JAXBContext.newInstance(GetTitleResponse.class);
                GetTitleResponse response = (GetTitleResponse) message.getPayload(context);
                response.setReturn(response.getReturn().toUpperCase());
                message.setPayload(response, context);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        }
        return true /* continue chain */;
    }

    public void close(MessageContext ctx) {}

    public boolean handleFault(LogicalMessageContext ctx) {
        return false;
    }
}
