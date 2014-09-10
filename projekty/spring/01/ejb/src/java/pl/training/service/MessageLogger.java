package pl.training.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/kolejka")
public class MessageLogger implements MessageListener {

    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("Wiadomość: " + message.getBody(String.class));
        } catch (JMSException ex) {
            Logger.getLogger(MessageLogger.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
