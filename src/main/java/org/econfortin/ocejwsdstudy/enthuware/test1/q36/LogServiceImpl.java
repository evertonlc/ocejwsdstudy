package org.econfortin.ocejwsdstudy.enthuware.test1.q36;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "LogWebService", name = "LogLog")
public class LogServiceImpl {
    @WebMethod
    public void log(String msg) {
        System.out.println(msg);
    }
}