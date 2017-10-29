package org.econfortin.ocejwsdstudy.enthuware.test2.q28;

import javax.jws.WebMethod;
import javax.jws.WebService;

/*
 * Neste ponto, só serão expostos o serviços log() e logParent() pois são as únicas classes que estão sendo expostas
 * através da anotação @WebService
 * Para uma classe expor seus métodos, ela deve ter a anotação @WebService, mesmo estando em uma hierarquia
 */
@WebService
public class LogServiceImpl extends LogServiceImplParent {
    public void log(String msg) {
        System.out.println(msg);
    }

    @WebMethod(exclude = true)
    public void logN(String msg) {
        System.out.println(msg);
    }
}
