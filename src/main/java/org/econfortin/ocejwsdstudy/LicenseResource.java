package org.econfortin.ocejwsdstudy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("license")
public class LicenseResource {

    @GET
    @Path("process")
    public Response getLicense() {
        return Response.ok().build();
    }

    @Path("{id}")
    public OrderResource findOrder(@PathParam("id") String id) {
        return new OrderResource(id);
    }

    public static class OrderResource {

        public OrderResource(String id) {}

        @GET
        public Response getOrder() {
            return Response.ok("Maroto").build();
        }
    }
}
