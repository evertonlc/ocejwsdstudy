package org.econfortin.ocejwsdstudy.enthuware.test1.q36;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * When the @WebServiceRef is defined on a (field) property and refers to a generated SEI type (e.g. LogLog)
 * - the value element must be present
 * - the type element may be present
 *
 *      @WebServiceRef(value=LogWebService.class, type=LogLog.class)
 *      LogLog l;
 *
 *      @WebServiceRef(value=LogWebService.class)
 *      LogLog l;
 *
 *      @WebServiceRef(LogWebService.class)
 *      LogLog l;
 *
 * When the @WebServiceRef is defined on a (field) property and refers to a generated service type (e.g. public class LogWebService extends Service )
 * - the value element must not be present
 * - the type element may be present
 *
 *      @WebServiceRef(type=LogLog.class)
 *      LogWebService o;
 *
 *      @WebServiceRef
 *      LogWebService o;
 *
 * When the @WebServiceRef annotation is defined on the class:
 * - the value element must be present
 * - the type element must be present
 * - the name element must be present (there is no default name;  this name is used when doing a lookup: “java:comp/env/<name>”)
 *
 *      @WebServiceRef(name="LogWebService", value=LogWebService.class, type=LogLog.class)
 *      public class LogServlet extends HttpServlet {...
 */
@WebServiceRef(name="LogWebService", value=LogWebService.class, type=LogLog.class)
@WebServlet(urlPatterns = "/log")
public class LogServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.write("<html><head></head><body>");
        String logString = request.getParameter("log");
        try {
            InitialContext context = new InitialContext();
            LogLog logService = (LogLog) context.lookup("java:comp/env/LogWebService");
            logService.log(logString);
        } catch (NamingException e) {
            e.printStackTrace();
        }
        writer.write("<h1>" + logString);
        writer.write("</h1>");
        writer.write("</body></html>");
    }
}
