package pl.training.service;

import java.util.List;
import javax.ejb.Local;
import pl.training.entity.Client;


@Local

//interfejs lokalny dla komponentu ejb, z zewnatrz nikt z niego nie skorzysta
public interface ClientsRepository {
    
    enum FilterType {
        LAST_NAME
    }
    
    Long add(Client client);
    List <Client>getAll();
    List <Client>getAll(FilterType filterType, String value);
}
