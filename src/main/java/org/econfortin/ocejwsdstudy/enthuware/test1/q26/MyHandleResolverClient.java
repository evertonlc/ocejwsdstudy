package org.econfortin.ocejwsdstudy.enthuware.test1.q26;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

public class MyHandleResolverClient implements HandlerResolver {
    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {

        ArrayList<Handler> chain = new ArrayList<Handler>();

        chain.add(new MySoapHandler());
        chain.add(new MyLogicalHandler());

        return chain;
    }
}
