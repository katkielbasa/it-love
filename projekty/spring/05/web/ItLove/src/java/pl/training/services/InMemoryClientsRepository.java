package pl.training.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;
import pl.training.entity.Client;

//@ApplicationScoped
//@ManagedBean
public class InMemoryClientsRepository {

    private Map<Long, Client> clients = new HashMap<>();
    private long lastId;
    
   // @Override
    public synchronized Long add(Client client) {
        client.setId(++lastId);
        clients.put(lastId, client);
        return lastId;
    }

  //  @Override
    public synchronized List<Client> getAll() {
        return new ArrayList<>(clients.values());
    }

  //  @Override
//    public List<Client> getAll(FilterType filterType, String value) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
