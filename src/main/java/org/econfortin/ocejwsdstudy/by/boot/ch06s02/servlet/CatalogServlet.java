package org.econfortin.ocejwsdstudy.by.boot.ch06s02.servlet;

import org.econfortin.ocejwsdstudy.by.boot.ch06s02.CatalogService;
import org.econfortin.ocejwsdstudy.by.boot.ch06s02.Catalog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="CatalogServlet", urlPatterns={"/CatalogServlet"})
public class CatalogServlet extends HttpServlet {

    @WebServiceRef(type=Catalog.class, wsdlLocation = "http://localhost:8080/ocejwsdstudy/CatalogService?wsdl")
    private CatalogService service;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Service instance injected
        Catalog port = service.getCatalogPort();
        String title = port.getTitle("12345");

        try {
            out.println("...");
            out.println("Title= " + title);
            out.println("...");
        } finally {
            out.close();
        }
    }
}