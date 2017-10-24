package org.econfortin.ocejwsdstudy.by.boot.ch10s02;

import org.econfortin.ocejwsdstudy.by.boot.ch06s02.GetTitle;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class JAXBExample {
    public static void main(String[] args) throws Exception {
        /*
         * Cria um contexto no(s) pacote(s) declarados
         */
        JAXBContext jc = JAXBContext.newInstance("org.econfortin.ocejwsdstudy.by.boot.ch06s02");

        // Create Unmarshaller object
        Unmarshaller u = jc.createUnmarshaller();

        /*
         * Desempacota o xml em uma árvore de objetos java
         * - Pode criar o objeto de um arquivo, InputStream, URL, StringBuffer, SAXSource, DOM node (construtores)
         */
        File f = new File(JAXBExample.class.getClassLoader().getResource("example.xml").toURI());
        JAXBElement<GetTitle> unmarshal = (JAXBElement<GetTitle>) u.unmarshal(f); //XML deve estar corretamente definido

        GetTitle value = unmarshal.getValue();
        System.out.println(value.getArg0());

        InputStream inputStream = new FileInputStream(f);
        JAXBElement<GetTitle> unmarshal1 = (JAXBElement<GetTitle>) u.unmarshal(inputStream);
        GetTitle value1 = unmarshal1 .getValue();
        System.out.println(value1.getArg0());

    }
}
