/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kursant5
 */
public class SaveClientDataServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        Client c = new Client();
        c.setName(req.getParameter("firstName"));
        c.setSurname(req.getParameter("lastName"));
        c.setRegion(req.getParameter("region"));
        c.setAge(Integer.parseInt(req.getParameter("age")));
        c.setMale(Boolean.parseBoolean(req.getParameter("male")));
        ClientDataDAO dao = new ClientDataDAOImpl();
        String ds1 = getServletContext().getInitParameter("ds1");
        try {
            dao.saveClientData(c, ds1);
        } catch (Exception ex) {
            Logger.getLogger(SaveClientDataServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
//        getServletContext().getRequestDispatcher("/controller").forward(req, resp); TO DZIAŁA DLA METODY GET
        resp.sendRedirect("controller");
    }
}
