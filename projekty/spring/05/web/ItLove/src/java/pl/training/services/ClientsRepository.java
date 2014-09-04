package pl.training.services;

import java.util.List;
import javax.ejb.Local;
import pl.training.entity.Client;

@Local
public interface ClientsRepository {

    enum FilterType {

        LAST_NAME, FIRST_NAME, SEX, AGE, IS_PARENT
    }

    Long add(Client client);

    List<Client> getAll();

    List<Client> getAll(FilterType filterType, String value); //NAZWA <Type> NIE MA ZNACZENIA, możeb yć <Cokolwiek> a potem , Cokolwiek value)

}
