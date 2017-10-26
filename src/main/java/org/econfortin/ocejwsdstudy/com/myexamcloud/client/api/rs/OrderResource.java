package org.econfortin.ocejwsdstudy.com.myexamcloud.client.api.rs;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/epractizelabs")
public class OrderResource {

    @Path( "/id" )
    @POST
    public String saveOrder() {
        return null;
    }

    @Path( "/d" )
    @GET
    public Response getOrderReport() {
        return Response.status(200).entity("ORDER").build();
    }
}