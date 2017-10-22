package org.econfortin.ocejwsdstudy.enthuware.trial.q08;

import javax.xml.ws.Endpoint;

public class MathTableServicePublisher {
    public static void main(String[ ] args) {
        // 1st argument is the publication URL
        // 2nd argument is an SIB instance
        Endpoint.publish("http://localhost:9999/math", new MathTableImpl());
    }
}
