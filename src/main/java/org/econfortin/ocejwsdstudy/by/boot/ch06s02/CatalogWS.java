package org.econfortin.ocejwsdstudy.by.boot.ch06s02;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * This annotation will produce a WSDL URL of:
 * http://localhost:8080/catalogWS/CatalogService?wsdl
 * That's because it is in the web context of "catalogWS",
 * which is the WAR name, appended with the value of the
 * serviceName property.
 *
 * Use that value in the properties file to generate client
 * artifacts.
 */
@WebService(serviceName="CatalogService", name="Catalog")
public class CatalogWS implements Catalog {

    @WebMethod
    @Override
    public String getTitle(String id) {
        if ("12345".equals(id)) return "OCE WSD 6 Guide";
        if ("67890".equals(id)) return "OCE WSD 6 Quiz";
        return "Item not in catalog";
    }

}
