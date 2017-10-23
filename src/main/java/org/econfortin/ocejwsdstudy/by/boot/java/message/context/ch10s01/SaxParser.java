package org.econfortin.ocejwsdstudy.by.boot.java.message.context.ch10s01;

import org.xml.sax.XMLReader;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser {
    static public void main(String[] args) throws Exception {
        String fileURL = "ndfdXMLserver.wsdl";
        SAXParserFactory spf = SAXParserFactory.newInstance();
        spf.setNamespaceAware(true);
        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        xmlReader.setContentHandler(new MyHandler());
        xmlReader.parse(fileURL);
    }

}
