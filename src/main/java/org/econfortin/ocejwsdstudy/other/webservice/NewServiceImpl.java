package org.econfortin.ocejwsdstudy.other.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Date;

@WebService
public class NewServiceImpl implements NewService {

    @WebMethod
    @Override
    public Date getDate() {
        return new Date();
    }
}
