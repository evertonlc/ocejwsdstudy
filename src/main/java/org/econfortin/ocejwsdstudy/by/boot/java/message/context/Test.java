package org.econfortin.ocejwsdstudy.by.boot.java.message.context;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.servlet.ServletContext;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService
public class Test {

    @Resource
    private WebServiceContext context;

    public String reverse(String inputString) {

        MessageContext mc = context.getMessageContext();
        ServletContext servletContext = (ServletContext) mc.get(MessageContext.SERVLET_CONTEXT);
        System.out.println(servletContext);
        return inputString;
    }
}
