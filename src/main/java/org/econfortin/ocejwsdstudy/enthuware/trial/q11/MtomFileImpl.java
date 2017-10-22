package org.econfortin.ocejwsdstudy.enthuware.trial.q11;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.ws.soap.MTOM;

/*
 * Deve ser usada apenas em @WebService, @WebServiceRef, @WebServiceProvider,
 * Quando usada com @WebService, deve ser usada apenas em uma SBI.
 * Quando ativada, dados binários enviados com tamanho maior que o threshold serão enviados como um anexo.
 * O valor default do threshold é 0
 */
@MTOM(enabled = true, threshold = 100)
@WebService
public class MtomFileImpl {

    @WebMethod
    public @XmlMimeType("application/octet-stream")
    byte[] echoBinary(@XmlMimeType("application/octet-stream") byte[] bytes) {
        return null;
    }
}
