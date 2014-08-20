
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

@WebServlet(urlPatterns= {"/controller"})
public class CoffeSelect extends HttpServlet{
    
    List<Customer> customers = new ArrayList<Customer>();
    
    public CoffeSelect(){
        super();
        
        Customer c1 = new Customer(1, "Jan", "Nowak", "444-555", "Aluzyjna", "678", "polska");
       Customer c2 = new Customer(2, "Anna", "Nowak", "777-555", "Arbuzowa", "789", "--");
       
       customers.add(c1);
       customers.add(c2);
    }
     @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        doPost(request, response);
    }
    
     
    @Override
     protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
 String myName = request.getParameter("name");
        System.out.println("Otrzymane name:" + myName);
        
 String myKomorka = request.getParameter("komorka");
        System.out.println("Otrzymany nr kom.:" + myKomorka);
        
 String myZawod = request.getParameter("zawod");
        System.out.println("Zawod klienta:" + myZawod);
        
 String myHobby = request.getParameter("hobby");
        System.out.println("Ulubione zajecie:" + myHobby);
        
        request.setAttribute("id1", "napis1");
        
        request.setAttribute("zawod1", myZawod);
        
         request.setAttribute("komorka1", myKomorka);
         
         request.setAttribute("hobby1", myHobby);
        
       request.setAttribute("customers", customers);
       RequestDispatcher view = request.getRequestDispatcher("customers.jsp");
       view.forward(request, response);
    }
    
}
