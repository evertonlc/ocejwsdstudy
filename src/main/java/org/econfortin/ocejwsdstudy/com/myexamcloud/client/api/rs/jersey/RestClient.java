package org.econfortin.ocejwsdstudy.com.myexamcloud.client.api.rs.jersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

public class RestClient {

    private static String url = "http://localhost:8080/ocejwsdstudy/vlavaav/home";

    public static void main(String[] args) {
        Client client = Client.create();
        WebResource webResource = client.resource(url);
        String s = webResource.get(String.class);

        System.out.println(s);
    }
}
