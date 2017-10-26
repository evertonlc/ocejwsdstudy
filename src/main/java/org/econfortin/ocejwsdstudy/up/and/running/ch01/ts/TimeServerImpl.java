package org.econfortin.ocejwsdstudy.up.and.running.ch01.ts;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.Date;

/*
 * endpointInterface liga a implementação que estamos criando (SIB, Service Implementation Bean) a interface do mesmo.
 * É possível termos uma SIB ligada a SEI apenas através do endpoint interface
 */
@WebService(endpointInterface = "org.econfortin.ocejwsdstudy.up.and.running.ch01.ts.TimeServer")
/*
 * Vai gerar:
 * service.name = TimeServerImplService
 * service.port.name = TimeServerImplServicePort
 *
 */
//@Stateless  //Tem que ter a @Stateless para ser um WebService e EJB
public class TimeServerImpl implements TimeServer {

    @Resource
    private WebServiceContext webServiceContext;

    @Override
    public String getTimeAsString() {
        return new Date().toString();
    }

    @Override
    public long getTimeAsElapsed() {
        try {
            MessageContext messageContext = webServiceContext.getMessageContext();
            //System.out.println(ejbContext);
            System.out.println(messageContext);
            Thread.currentThread().sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Date().getTime();
    }

    public void t() {

    }
}
