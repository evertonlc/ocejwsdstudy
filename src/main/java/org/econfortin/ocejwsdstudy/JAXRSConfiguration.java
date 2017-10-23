package org.econfortin.ocejwsdstudy;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

@ApplicationPath("/vlavaav")
@Path("/home")
public class JAXRSConfiguration extends Application {

    @GET
    public Response t() {
        System.out.println("Teste");
        return Response.ok().build();
    }
}
