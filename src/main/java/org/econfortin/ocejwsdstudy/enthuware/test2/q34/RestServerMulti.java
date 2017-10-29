package org.econfortin.ocejwsdstudy.enthuware.test2.q34;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("multi")
public class RestServerMulti {
    @GET
    @Produces("text/plain")
    public String getPText(@QueryParam("zip") int zipCode,
                           @QueryParam("hnr") int houseNumber) {
        String address = convert(zipCode, houseNumber);
        return "plain";
    }

    //Navegadores por default vão enviar os Accept como: text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8
    //Logo, o método que será chamado caso a chamada venha de um navegador é esta
    @GET
    @Produces("text/html")
    public String getPTextHtml(@QueryParam("zip") int zipCode, @QueryParam("hnr") int houseNumber) {
        String address = convert(zipCode, houseNumber);
        return "html";
    }

    @GET
    @Produces("application/json")
    public String getPTextJson(@QueryParam("zip") int zipCode,
                               @QueryParam("hnr") int houseNumber) {
        String address = convert(zipCode, houseNumber);
        return "json";
    }

    @GET
    public String getPTextWhatever(@QueryParam("zip") int zipCode,
                                   @QueryParam("hnr") int houseNumber) {
        String address = convert(zipCode, houseNumber);
        return "whatever";
    }

    private String convert(int zipCode, int houseNumber) {
        return null;
    }
}
