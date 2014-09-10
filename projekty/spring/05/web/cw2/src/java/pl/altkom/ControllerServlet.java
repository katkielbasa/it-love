package pl.altkom;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String path = req.getContextPath();
        
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html; charset=UTF-8");
        out.println("<!DOCTYPE html>");
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Wybór marki</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<DIV><a href=\""+path+"/makeForm.html\">Wybór marki</DIV>");
        out.println("</BODY>");
        out.println("</HTML>");
        
    }
    
}
