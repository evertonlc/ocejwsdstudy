package org.econfortin.ocejwsdstudy.up.and.running.ch01.ts;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {
    public static void main(String[ ] args) {
        // 1st argument is the publication URL
        // 2nd argument is an SIB instance
        Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServerImpl());
    }
}
