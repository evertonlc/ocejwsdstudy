package org.econfortin.ocejwsdstudy.enthuware.trial.q16;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


/*
 * We want to secure this Web Service in order to only allow users in the role "student".
 * What is the correct web.xml to implement this requirement?
 *  Cria uma restrição de segurança para o método GET na url /jax/rs/ e as urls que estiverem abaixo dela para o usuário
 *  'student'.
 *  Dentro do security-constraint devem estar as urls e os métodos que desejamos proteger, bem como as roles que
 *  desejamos que tenham acesso a estes recursos.
 *  <security-constraint>
 *      <web-resource-collection>
 *          <web-resource-name>secure addition</web-resource-name>
 *          <url-pattern>/jax/rs/*</url-pattern>
 *          <http-method>GET</http-method>
 *      </web-resource-collection>
 *      <auth-constraint>
 *          <role-name>student</role-name>    
 *      </auth-constraint>
 *  </security-constraint>
 */
//@ApplicationPath("jax")
@Path("rs")
public class AdditionService {

    @GET
    @Path("/add/{num1}/{num2}")
    public String addp(@PathParam("num1") int num, @PathParam("num2") int num2) {
        return "" + (num + num2);
    }
}
