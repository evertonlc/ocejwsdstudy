package org.econfortin.ocejwsdstudy.enthuware.trial.q08;

import javax.jws.WebService;

@WebService
public interface MathTableService {
    public SimpleMathTable getTable(Integer number);
}
