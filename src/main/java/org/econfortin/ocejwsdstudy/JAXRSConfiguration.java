package org.econfortin.ocejwsdstudy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/home")
public class JAXRSConfiguration {

    @GET
    public Response t() {
        System.out.println("Teste");
        return Response.ok("Teste").build();
    }
}
