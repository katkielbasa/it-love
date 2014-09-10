/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author kursant5
 */
@WebServlet(name = "Redirect", urlPatterns = {"/redirect"})
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("http://www." + req.getParameter("car") + ".com");
        
//        PrintWriter out = resp.getWriter();
//        resp.setContentType("text/html; charset=UTF-8");
//        out.println("<!DOCTYPE html>");
//        out.println("<HTML>");
//        out.println("<HEAD>");
//        out.println("<TITLE>Wybrana marka</TITLE>");
//        out.println("</HEAD>");
//        out.println("<BODY>");
//        out.println("<DIV>Wybrana marka: " + req.getParameter("car") + "</DIV>");
//        out.println("<DIV><a href=\"controller\">Powrót</DIV>");
//        out.println("</BODY>");
//        out.println("</HTML>");
        
    }
}
