/*
 * Interfejs definiujący metody wymagane do obsługi bazy klientów
 */
package pl.nitecki.services;

import java.util.List;
import javax.ejb.Local;
import pl.nitecki.entity.Cargo;

/**
 *
 * @author znitecki
 */
@Local
public interface CargoRepository {

    Long add(Cargo cargo);

    List<Cargo> getAll(); //później będize String order żeby sortować 

    void remove(Long id);

    void update(Cargo cargo);

}
