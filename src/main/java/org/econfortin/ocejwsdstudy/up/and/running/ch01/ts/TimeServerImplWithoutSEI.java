package org.econfortin.ocejwsdstudy.up.and.running.ch01.ts;

import javax.jws.WebService;

/*
 * Neste caso, irá expor a classe como SEI
 * No caso, apenas os métodos públicos serão expostos na WSDL
 */
@WebService
public class TimeServerImplWithoutSEI {

    public void publicMethodExposedAsWebMethod() {

    }

    private void privateMethodNotExposed() {

    }
}
