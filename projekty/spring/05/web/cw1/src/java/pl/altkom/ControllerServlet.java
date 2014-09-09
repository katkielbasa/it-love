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

        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html; charset=UTF=8");
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Menu glowne</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<H1>WITAJ!</H1>");
        out.println("</BODY>");
        out.println("</HTML>");

    }

}
