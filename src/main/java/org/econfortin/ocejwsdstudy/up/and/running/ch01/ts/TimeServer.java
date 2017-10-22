package org.econfortin.ocejwsdstudy.up.and.running.ch01.ts;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/*
 * @WebService Indica a interface como uma SEI (Service endpoint interface)
 *
 */
@WebService
/*
 * @SOAPBinding influencia na construção da WSDL.
 * - RPC: Simplifica o contrato e torna o deployment mais simples
 */
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeServer {
    /*
     * @WebMethod para indicar o método como uma operação do serviço.
     */
    @WebMethod String getTimeAsString();
    @WebMethod long getTimeAsElapsed();
}
