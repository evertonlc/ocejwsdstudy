package org.econfortin.ocejwsdstudy.up.and.running.ch01.ts;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

class TimeClient {

    public static final String Namespace = "http://ts.ch01.running.and.up.ocejwsdstudy.econfortin.org/";

    public static void main(String args[]) throws Exception {
        URL url = new URL("http://localhost:8080/ocejwsdstudy/TimeServerImpl?wsdl");
        // Qualified name of the service:
        // 1st arg is the service URI
        // 2nd is the service name published in the WSDL
        QName qname = new QName(Namespace, "TimeServerImplService");

        // Create, in effect, a factory for the service.
        Service service = Service.create(url, qname);

        // Extract the endpoint interface, the service "port".
        TimeServer eif = service.getPort(TimeServer.class);

        //QName portName = new QName(Namespace, "MathTableImplPort");
        //service.getPort(portName, TimeServer.class);

        //QName next = service.getPorts().next();
        //service.getPort(next, TimeServer.class);

        System.out.println(eif.getTimeAsString());
        System.out.println(eif.getTimeAsElapsed());
    }
}