package org.econfortin.ocejwsdstudy.enthuware.test1.q17;

import org.econfortin.ocejwsdstudy.enthuware.trial.q08.SimpleMathTable;

import javax.jws.WebService;

@WebService
public interface MathTableServiceOther {
    public SimpleMathTable getTable(Integer number);
}
