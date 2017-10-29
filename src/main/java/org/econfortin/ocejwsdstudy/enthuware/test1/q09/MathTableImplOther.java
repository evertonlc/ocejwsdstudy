package org.econfortin.ocejwsdstudy.enthuware.test1.q09;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.MTOMFeature;

/*
 * Sobre @Resource
 * The javax.annotation.Resource annotation defined by JSR-250 is used to request injection of the WebServiceContext.
 *
 * The following constraints apply to the annotation elements of a Resource annotation used to inject a WebServiceContext:
 * - The type element MUST be either java.lang.Object (the default) or javax.xml.ws.WebServiceContext.
 * - The authenticationType, shareable elements, if they appear, MUST have their respective default values.
 *
 * If the type is java.lang.Object, then the resource MUST be injected into a field or a method.
 * In this case, the type of the field or the type of the JavaBeans property defined by the method MUST be javax.xml.ws.WebServiceContext.
 */
//Vai injetar o resource do tipo WebServiceContext na variável com o nome context;
@Resource(name = "context", type = javax.xml.ws.WebServiceContext.class)
@WebService
public class MathTableImplOther {

    private WebServiceContext context;

    public void t() {
        new MTOMFeature();
        System.out.println(context);
    }
}