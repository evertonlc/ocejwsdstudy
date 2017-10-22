package org.econfortin.ocejwsdstudy.up.and.running.ch01.ts;

import javax.jws.WebService;
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
public class TimeServerImpl implements TimeServer {
    @Override
    public String getTimeAsString() {
        return new Date().toString();
    }

    @Override
    public long getTimeAsElapsed() {
        return new Date().getTime();
    }

    public void t() {

    }
}
