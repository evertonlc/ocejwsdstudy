package org.econfortin.ocejwsdstudy.enthuware.trial.q07;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;

@ApplicationPath("math")
@Path("table")
public class TableService extends Application {
    @POST
    @Path("/post")
    @Consumes("application/x-www-form-urlencoded")
    @Produces("text/plain")
    public String addp(String num) {
        MathTable mt = new MathTable(new Integer(num));
        return mt.toString();
    }


    public static void main(String[] args) {
        Client cl = Client.create();
        WebResource webResource = cl
                .resource("http://localhost:8081/SimpleRS/math/table/post");
        String entity = "5";
        /*
         * Configuração do recurso enviando o valor 5 como x-www-form-urlencoded
         * e esperando uma string como resposta
         */
        String response = webResource
            .accept("text/plain")
            .entity(entity, "application/x-www-form-urlencoded")
            .post(String.class);    //Poderia ser qualquer método HTTP
        System.out.println(response);
    }
}