package pl.altkom;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="redirect",urlPatterns ="/redirect")
public class RedirectServlet extends HttpServlet {

  @Override
  // protected void doGet(HttpServletRequest request, HttpServletResponse
  // response)
  // throws ServletException, IOException {
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {

    // response.setContentType("text/html; charset=UTF-8");
    // PrintWriter out = response.getWriter();

    // out.println("<html>");
    // out.println("<head>");
    //
    // out.println("<title>Redirect Servlet</title>");
    // out.println("</head>");
    // out.println("<body bgcolor=\"white\">");

    // obecne we wszystkich krokach
    String make = request.getParameter("make");

    // wykomentuj w krokach 1-4
    if (make.equalsIgnoreCase("ford")) {
      response.sendRedirect("http://www.ford.com/");
    }
    if (make.equalsIgnoreCase("fiat")) {
      response.sendRedirect("http://www.fiat.com/");
    }
    if (make.equalsIgnoreCase("renault")) {
      response.sendRedirect("http://www.renault.com/");
    }

    // out.println("<h1>Twoja ulubiona marka samochodu to " + make + "!</h1>");
    //
    // String cp = request.getContextPath();

    // String path = cp + "/controller";
    // out.println("<a href=\"" + path + "\">Powrót</a></h1>");

    // path = cp + "/makeForm.html";
    // out.println("<a href=\"" + path + "\">Ulubiona marka</a></h1><br>");
    //
    // out.println("</body>");
    // out.println("</html>");
  }
}