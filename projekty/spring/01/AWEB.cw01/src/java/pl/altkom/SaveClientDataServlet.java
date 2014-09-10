package pl.altkom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveClientDataServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        Client c = new Client();
//        odebranie danych z formularza- wpisanie ich do obiektu
        c.setName(req.getParameter("name"));
        c.setSurname(req.getParameter("surname"));
        c.setRegion(req.getParameter("region"));
        c.setAge((Integer.parseInt(req.getParameter("age"))));
        c.setMale(Boolean.parseBoolean(req.getParameter("male")));

        ClientDataDAO dao = new ClientDataDAOImpl();
//tutaj ,moglibysmy podac nowa implementacje wtedy napisalibysmy:
//dao=new ClientDataDAOImpl2();
        String ds1 = getServletContext().getInitParameter("ds1");
        try {
            dao.saveClientData(c, ds1);
        } catch (Exception ex) {
            Logger.getLogger(SaveClientDataServlet.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
//        przekazanie sterowania bezpowrotnie:
//    do metody GET:
//        getServletContext().getRequestDispatcher("/controller").forward(req, resp);
//  do metody POST:
        resp.sendRedirect("controller");
//    metoda POST da nam tez to, że dane które wpisujemy do formularza, 
//        nie beda sie wyswietlały w przegladarce

    }

}
