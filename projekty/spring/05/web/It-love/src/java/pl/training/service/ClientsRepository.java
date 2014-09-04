package pl.training.service;

import java.util.List;
import pl.training.entity.Client;

public interface ClientsRepository {
    
    Long add(Client client);
    
    List<Client> getAll();
    
}
