package org.econfortin.ocejwsdstudy.by.boot;

import javax.xml.ws.Endpoint;

public class TestPublisher {

    public static void main(String[ ] args) {
        // 1st argument is the publication URL
        // 2nd argument is an SIB instance
        Endpoint.publish("http://localhost:9001/test", new Test());
    }
}
