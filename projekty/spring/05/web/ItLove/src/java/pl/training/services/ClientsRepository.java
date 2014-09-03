package pl.training.services;

import java.util.List;
import javax.ejb.Local;
import pl.training.entity.Client;

@Local
public interface ClientsRepository {

    enum FilterType {
        LAST_NAME
    }
    
    Long add(Client client);

    List<Client> getAll();
    
    List<Client> getAll(FilterType filterType, String value);

}
