package org.econfortin.ocejwsdstudy.by.boot.ch10s04;

import org.econfortin.ocejwsdstudy.by.boot.ch06s02.Catalog;
import org.econfortin.ocejwsdstudy.by.boot.ch06s02.CatalogService;

import javax.xml.ws.BindingProvider;
import java.util.Map;

public class HelloClientHttpSession {
    public static void main(String... args) throws Exception {

        // Obtain the dynamic stub from the Service
        CatalogService service = new CatalogService();
        Catalog proxy = service.getCatalogPort();

        // Cast the proxy to a BindingProvider
        BindingProvider bindingProvider = (BindingProvider) proxy;

        // Get the request context
        Map<String, Object> requestContext = bindingProvider.getRequestContext();

        // Configure session preference
        // Propriedades padrão
        //requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, true);
        //requestContext.put(BindingProvider.USERNAME_PROPERTY, true);
        //requestContext.put(BindingProvider.PASSWORD_PROPERTY, true);
        requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY, true);

        // Perform Web service method invocation and print the result
        String message = proxy.getTitle("Mikalai");
        System.out.println(message);
    }
}
