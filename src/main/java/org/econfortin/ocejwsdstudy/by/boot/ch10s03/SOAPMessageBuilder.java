package org.econfortin.ocejwsdstudy.by.boot.ch10s03;

import javax.activation.DataHandler;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import java.net.URL;

public class SOAPMessageBuilder {
    public static void main(String[] args) throws Exception{

        /*
         * Construindo uma mensagem SOAP na mão.
         * O código abaixo vai gerar a mensagem soap
         * <SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/">
               <SOAP-ENV:Header>
                  <wsi:Claim conformsTo="http://ws-i.org/profiles/basic/1.1/" xmlns:wsi="http://ws-i.org/schemas/conformanceClaim/"/>
                  <wsi:Claim xmlns:wsi="http://ws-i.org/schemas/conformanceClaim/">Texto do header</wsi:Claim>
               </SOAP-ENV:Header>
               <SOAP-ENV:Body>
                  Vlavaav
                  <m:GetLastTradePrice xmlns:m="http://wombat.ztrade.com">
                     <symbol>SUNW</symbol>
                  </m:GetLastTradePrice>
                  <m:GetLastTradePrice xmlns:m="http://wombat.ztrade.com"/>
                  <m:GetLastTradePrice xmlns:m="http://wombat.ztrade.com"/>
               </SOAP-ENV:Body>
            </SOAP-ENV:Envelope>

         */
        SOAPMessage message = MessageFactory.newInstance().createMessage();
        SOAPPart soapPart = message.getSOAPPart();
        SOAPEnvelope envelope = soapPart.getEnvelope();

        SOAPHeader header = envelope.getHeader(); // == message.getSOAPHeader();
        SOAPBody body = envelope.getBody(); // == message.getSOAPBody();

        body.addTextNode("Vlavaav");

        QName headerName = new QName("http://ws-i.org/schemas/conformanceClaim/", "Claim", "wsi");
        SOAPHeaderElement headerElement = header.addHeaderElement(headerName);
        headerElement.addAttribute(new QName("conformsTo"), "http://ws-i.org/profiles/basic/1.1/");
        SOAPHeaderElement soapHeaderElement = header.addHeaderElement(headerName);
        soapHeaderElement.addTextNode("Texto do header");

        QName bodyName = new QName("http://wombat.ztrade.com", "GetLastTradePrice", "m");   //Vai montar xmlns:m="http://wombat.ztrade.com"
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);    //Adiciona um elemento filho
        body.addBodyElement(bodyName);
        body.addChildElement(bodyName);
        QName name = new QName("symbol");
        SOAPElement symbol = bodyElement.addChildElement(name); //Adiciona um elemento filho
        symbol.addTextNode("SUNW"); //Adiciona conteúdo ao ememento

        AttachmentPart attachment = message.createAttachmentPart();
        String stringContent = "10 Upbeat Street, Pleasant Grove, CA 95439";
        attachment.setContent(stringContent, "text/plain");     //Pode ser String, a stream, a javax.xml.transform.Source ou javax.activation.DataHandler
        attachment.setContentId("update_address");
        message.addAttachmentPart(attachment);

        URL url = SOAPMessageBuilder.class.getClassLoader().getResource("example.xml");
        DataHandler dataHandler = new DataHandler(url);
        AttachmentPart attachment2 = message.createAttachmentPart(dataHandler);
        attachment.setContentId("attached_xml");

        message.addAttachmentPart(attachment);
        message.addAttachmentPart(attachment2);

        message.writeTo(System.out);
    }
}
