package org.econfortin.ocejwsdstudy.enthuware.test3.q30;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;

/*
 * From the JAX-RS v1.1 specs:
 * "A Servlet-based implementation MUST support injection of the following Servlet-defined types: ServletConfig,
 * ServletContext, HttpServletRequest and HttpServletResponse."
 *
 * Injection of an EJB in a JAX-RS root resource (that is deployed as an EJB) is required by the (EJB) specifications.
 * If we add the @Stateless annotation on the MultiplyResource, the injection of the AdditionService will work.
 * Injection of an EJB in a JAX-RS root resource (that is deployed as a Servlet) is not required by the specifications.
 *
 * @Context
 * HttpHeaders
 * Check https://jersey.java.net/documentation/1.18/user-guide.html
 * 2.3. Extracting Request Parameters, example Example 2.18.
 *
 * Or JAX-RS v1.1 Chapter 5. Context, 5.2.3 Headers.
 * An instance of HttpHeaders can be injected into a class field or method parameter using the @Context annotation.
 */

@Path("multiple")
public class MultiplyResource {

    //@Context vale aqui também
    private HttpHeaders hdrs;

    @Context
    private HttpServletRequest req;

    @GET
    @Path("{one}/{two}")
    public String getNumber(@PathParam("one") int num1, @PathParam("two") int num2) {
        System.out.println(hdrs.getAcceptableMediaTypes());
        System.out.println(req);
        return "all right";
    }

    @Context
    public void setHdrs(HttpHeaders hdrs) {
        this.hdrs = hdrs;
    }
}
