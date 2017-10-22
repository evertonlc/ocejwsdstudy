package org.econfortin.ocejwsdstudy.enthuware.trial.q10;

import com.sun.xml.internal.messaging.saaj.soap.ver1_2.Envelope1_2Impl;

import javax.xml.soap.*;

public class SoapMessagemCreation {

    public static void main(String[] args) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage message = messageFactory.createMessage();
        SOAPEnvelope soapFactory = new Envelope1_2Impl(null, null);
        String endpoint = null;

        Name bodyName = soapFactory.createName("getResultTimeInSeconds", "ns2", endpoint);
        SOAPBody body = message.getSOAPBody();
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);
        SOAPElement arg = bodyElement.addChildElement("arg0");
        SOAPElement km = arg.addChildElement("kmPerHour");
        km.addTextNode("12.0");
        SOAPElement m = arg.addChildElement("meters");
        m.addTextNode("5000.0");

        System.out.println();

        /*
         * O código acima irá gerar o XML abaixo
         * <ns2:getResultTimeInSeconds>
         *      <arg0>
         *          <kmPerHour>12.0<kmPerHour>
         *          <meters>5000.0<meters>
         *      </arg0>
         * </ns2:getResultTimeInSeconds>
         */
    }
}
