package pl.training;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import pl.training.service.Dictionary;
import pl.training.service.IdGenerator;
import pl.training.service.TimeService;

public class Client {

    public static void main(String[] args) {
        try {
            InitialContext context = new InitialContext();
//            IdGenerator generator = (IdGenerator) context.lookup("java:global/ejb/DefaultIdGenerator");
            TimeService timeService = (TimeService) context.lookup("java:global/ejb/DefaultTimeService");
//            System.out.println(generator.nextId());

            System.out.println(timeService.getTime());
            Dictionary dictionary = (Dictionary) context.lookup("java:global/ejb/MapDictionary");
            dictionary.addEntry("zbyszek", "zbyszek");
            dictionary.addEntry("Roman Giertych", "Roman Giertych");
            System.out.println(dictionary.getEntry("Roman Giertych"));
            System.out.println(dictionary.getEntry("lukasz"));

            System.out.println(dictionary.getAll());

            ConnectionFactory connectionFactory = (ConnectionFactory) context.lookup("jms/connectionPool");

            Queue queue = (Queue) context.lookup("jms/kolejka");
            
            try (JMSContext jmsContext = connectionFactory.createContext()) {
                jmsContext.createProducer().send(queue, "Resistance is futile");
            }
            
        } catch (NamingException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
