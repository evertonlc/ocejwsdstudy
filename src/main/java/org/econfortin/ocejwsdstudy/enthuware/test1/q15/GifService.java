package org.econfortin.ocejwsdstudy.enthuware.test1.q15;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlMimeType;
import java.awt.Image;

/*
 * There are two ways to change the default mapping from Java -> XML -> Java
 * java.awt.Image -> xs:base64Binary -> byte[]
 *
 * You either change the WSDL from:
 * <xs:complexType name="getGifImageResponse">
 *     <xs:sequence>
 *         <xs:element name="return" type="xs:base64Binary" minOccurs="0" />     
 *     </xs:sequence>
 * </xs:complexType>
 * to:
 * <xs:complexType name="getGifImageResponse">
 *     <xs:sequence>
 *         <xs:element name="return" type="xs:base64Binary" minOccurs="0" xmime:expectedContentTypes="image/gif" xmlns:xmime="http://www.w3.org/2005/05/xmlmime"/>
 *     </xs:sequence>
 * </xs:complexType>
 *
 * Or you can use the @XmlMimeType annotation on the SEI:
 * @WebService public interface GifService {
 *      public @XmlMimeType("image/gif") Image getGifImage(String name); }
 *
 * Note that if a SIB refers to a SEI, the only annotations that are allowed on a SIB are @WebService, @HandlerChain, @MTOM, and @Addressing.
 */
@WebService
public interface GifService {
    public @XmlMimeType("image/gif") Image getGifImage(String name);
}