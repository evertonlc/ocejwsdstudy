package org.econfortin.ocejwsdstudy.enthuware.test1.q52;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.List;

/*
 * In this question we have got examples of option 4 ( List<Integer>, Set<Integer>) where Integer is a valid option 2 (it has a String constructor)
 *
 * From JAX-RS 1.1
 * @MatrixParam Extracts the value of a URI matrix parameter.
 * @QueryParam Extracts the value of a URI query parameter.
 * @PathParam Extracts the value of a URI template parameter.
 * @CookieParam Extracts the value of a cookie.
 * @HeaderParam Extracts the value of a header.
 * @Context Injects an instance of a supported resource, see chapters 5 and 6 for more details.
 *
 * Valid parameter types for each of the above annotations are listed in the corresponding Javadoc, however in general
 * (excluding @Context) the following types are supported:
 * 1. Primitive types.
 * 2. Types that have a constructor that accepts a single String argument.
 * 3. Types that have a static method named valueOf or fromString with a single String argument that return an instance of the type.
 *  If both methods are present then valueOf MUST be used unless the type is an enum in which case fromString MUST be used.
 * 4. List<T>, Set<T>, or SortedSet<T>, where T satisfies 2 or 3 above.
 */

@Path("mamamia")
public class RestEndpoint {
    @GET
    @Path("/add/{num}/{num}")
    public String addlist(@PathParam("num") List<Integer> numbers) {
        return "" + (numbers.get(0) + numbers.get(1));
    }

    @GET
    @Path("/add/{num1}plus{num2}")
    public String addnums(@PathParam("num1") int num, @PathParam("num2") int num2) {
        return "" + (num + num2);
    }

    /*
     * spaces are allowed in the URL.
     * A valid URL for this method would be:
     * - http://localhost:8080/SimpleRS/jax/rs/add/6%20plus%209 or
     * - http://localhost:8080/SimpleRS/jax/rs/add/6 plus 9
     * a space character is automatically encoded by JAX-RS
     */
    @GET
    @Path("/add/{num1} plus {num2}")
    public String addnumbers(@PathParam("num1") int num, @PathParam("num2") int num2) {
        return "" + (num + num2);
    }

    /*
     * Although this is a correct declaration, the "+" sign is interpreted by JAX-RS as a special regular expression character.
     * It will add the last two numbers in the given URL:
     * - http://localhost:8080/SimpleRS/jax/rs/add/3+45+9a6--..469 will result in 15 (6+9)
     */
    @GET
    @Path("/add/{num1}+{num2}")
    public String addp(@PathParam("num1") int num, @PathParam("num2") int num2) {
        return "" + (num + num2);
    }
}
