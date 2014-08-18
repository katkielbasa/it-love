/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.mvc01.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pl.altkom.mvc01.model.Customer;

/**
 *
 * @author kursant5
 */
@WebServlet(urlPatterns = {"/controller"})
public class CoffeSelect extends HttpServlet {

    List<Customer> customers = new ArrayList<Customer>();

    public CoffeSelect() {
        super(); //na wszelki wypadek bierzemy konstruktor nadklasy
//        Customer c1 = new Customer(1, "Jan", "aluzyjna", "33234-232", "kowalski", "26244225245");
//        Customer c2 = new Customer(2, "Roman", "Syberyjska", "34234-232", "Giertych", "2323123412");
//        customers.add(c1);
//        customers.add(c2);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String myName = request.getParameter("name");
        String mySurname = request.getParameter("surname");
        String myAddress = request.getParameter("address");
        String myPhone = request.getParameter("phone");
        String myPesel = request.getParameter("pesel");
        
        if (myName != null && !myName.isEmpty()) {
            System.out.println("JESTEM");
            Customer customer = new Customer(1, myName, myAddress, myPhone, mySurname, myPesel);
            customers.add(customer);
        }

        System.out.println("Ontrzymane surname: " + mySurname);
        System.out.println("Ontrzymane name: " + myName);
        System.out.println("Ontrzymane adres: " + myAddress);
        System.out.println("Ontrzymane surname: " + myPhone);
        System.out.println("Ontrzymany pesel: " + myPesel);

        request.setAttribute("customers", customers);

        request.setAttribute("name", myName);
        request.setAttribute("address", myAddress);
        request.setAttribute("surname", mySurname);
        request.setAttribute("phone", myPhone);
        request.setAttribute("pesel", myPesel);

        RequestDispatcher view = request.getRequestDispatcher("customers.jsp");

        view.forward(request, response);
    }
}
