package org.econfortin.ocejwsdstudy.by.boot.ch10s03;

import org.econfortin.ocejwsdstudy.by.boot.ch06s02.GetTitle;
import org.econfortin.ocejwsdstudy.by.boot.ch06s02.ObjectFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;
import javax.xml.ws.Service;
import javax.xml.ws.soap.SOAPBinding;

public class HelloJaxbClient {
    private static final String TNS = "http://ch06s02.boot.by.ocejwsdstudy.econfortin.org/";

    public static void main(String... args) throws Exception {

        // Define the service name, port name, and endpoint address
        QName serviceName = new QName(TNS, "CatalogService");
        QName portName = new QName(TNS, "CatalogPort");
        String endpoint = "http://localhost:8080/ocejwsdstudy/CatalogService";

        // Create a service that can bind to the HelloMessenger port
        Service service = Service.create(serviceName);
        service.addPort(portName, SOAPBinding.SOAP11HTTP_BINDING, endpoint);

        // Create a JAXB enabled Dynamic Dispatch client
        JAXBContext context = JAXBContext.newInstance("org.econfortin.ocejwsdstudy.by.boot.ch06s02");
        Dispatch<Object> dispatch = service.createDispatch(portName, context, Service.Mode.PAYLOAD);

        // Create JAXB request object
        ObjectFactory objectFactory = new ObjectFactory();
        GetTitle request = objectFactory.createGetTitle();
        request.setArg0("12345");

        JAXBElement<GetTitle> requestMessage = objectFactory.createGetTitle(request);

        // Invoke the HelloMessenger Web service
        dispatch.invokeAsync(requestMessage, new MyHandler());

        // Get the JAXB response
        /*GetTitleResponse response = responseMessage.getValue();

        String value = response.getReturn();

        // Print the response
        System.out.println(value);*/
    }

    public static class MyHandler implements AsyncHandler<Object> {
        @Override
        public void handleResponse(Response<Object> res) {
            System.out.println(res);
        }
    }
}