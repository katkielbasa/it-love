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
 * @author kursant1
 */
@WebServlet(urlPatterns = {"/controller"})
public class CoffeeSelect extends HttpServlet {

    List<Customer> customers = new ArrayList<Customer>();

    public CoffeeSelect() {
        super();
        Customer c1 = new Customer(1, "Jan", "Kowalski", "Aluzyjna", "546-456-456", "ACT432669", "4565464891", "trener");
        Customer c2 = new Customer(2, "Tomasz", "Konowalski", "Bazyjna", "500-400-400", "BAT986456", "8955654655", "informatyk");
        customers.add(c1);
        customers.add(c2);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //te dwie linijki ponizej umozliwiaja wyswietlenie na konsoli 
        //w NetBeansie tego co wpiszemy w pola name i surname w przegladarce
        String myName = request.getParameter("name");
        String mySurname = request.getParameter("surname");
        String myAddress = request.getParameter("address");
        String myPhone = request.getParameter("phone");
        String myID = request.getParameter("ID");
        String myNIP = request.getParameter("NIP");
        String myJob = request.getParameter("job");
        System.out.println("Otrzymane dane: " + myName + " " + mySurname +
                " " + myAddress + " " + myPhone+ " " + myID + " " + myNIP + " " + myJob);
        request.setAttribute("id1", "napis1");
        request.setAttribute("customers", customers);
        request.setAttribute("Dokument1", myName);
        request.setAttribute("Dokument2", mySurname);
        request.setAttribute("Dokument3", myAddress);
        request.setAttribute("Dokument4", myPhone);
        request.setAttribute("Dokument5", myID);
        request.setAttribute("Dokument6", myNIP);
        request.setAttribute("Dokument7", myJob);

        //wskazanie formatki docelowej- pliku 
        RequestDispatcher view = request.getRequestDispatcher("customers.jsp");
        view.forward(request, response);
    }
}
