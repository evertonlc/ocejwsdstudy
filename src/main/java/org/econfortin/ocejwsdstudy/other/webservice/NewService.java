package org.econfortin.ocejwsdstudy.other.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService
public interface NewService {

    @WebMethod
    public Date getDate();
}
