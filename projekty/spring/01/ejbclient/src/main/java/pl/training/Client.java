package pl.training;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import pl.training.service.TimeService;

public class Client {

    public static void main(String[] args) {
        
        try {
            InitialContext context = new InitialContext();
            TimeService timeService = (TimeService) context.lookup("java:global/EJB/DefaultTimeService");
            System.out.println(timeService.getTime());
        } catch (NamingException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
