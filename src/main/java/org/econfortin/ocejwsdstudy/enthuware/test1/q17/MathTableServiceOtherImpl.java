package org.econfortin.ocejwsdstudy.enthuware.test1.q17;

import org.econfortin.ocejwsdstudy.enthuware.trial.q08.SimpleMathTable;

import javax.jws.WebService;
import javax.xml.ws.soap.Addressing;

/**
 * How do we enable the Addressing Web Service feature on the following Web Service?
 * <p>
 * From the API javax.xml.ws.soap Annotation Type Addressing When used with a javax.jws.WebService annotation,
 * this annotation MUST only be used on the service endpoint implementation class (SIB).
 */

@Addressing
@WebService//(endpointInterface = "MathTableServiceOther")
public class MathTableServiceOtherImpl implements MathTableServiceOther {
    @Override
    public SimpleMathTable getTable(Integer number) {
        SimpleMathTable table = new SimpleMathTable(number);
        return table;
    }
}
