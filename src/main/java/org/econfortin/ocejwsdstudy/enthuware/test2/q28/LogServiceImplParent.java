package org.econfortin.ocejwsdstudy.enthuware.test2.q28;

import javax.jws.WebService;

@WebService
public class LogServiceImplParent extends LogServiceSuper {
    public void logParent(String msg) {
        System.out.println(msg);
    }
}
