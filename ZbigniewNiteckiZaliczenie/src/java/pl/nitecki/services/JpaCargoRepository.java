/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.nitecki.services;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pl.nitecki.entity.Cargo;

/**
 *
 * @author znitecki
 */
@Stateless
public class JpaCargoRepository implements CargoRepository {
    
    private static final String JPA_GET_ALL = "select c from Cargo c"; // tworzy statycznego (jedną instancję) finalnego Stringa - query do bazy danych

    @PersistenceContext(unitName = "storage") // dla entityManagera tworzy kontekst. unitName pokazuje mu nazwę bazy danych. 'storage' to nazwa bazy utworzonej w MySQLu.
    private EntityManager entityManager; // tworzy obiekt EntityManagera.

    @Override
    public Long add(Cargo cargo) {
        entityManager.persist(cargo); // sprawia że encja staje się zarządzana (managed) oraz trwała (persistent)
        entityManager.flush(); // wymusza 'wypłukanie' danych do bazy
        entityManager.refresh(cargo); // odświeża bazę by zmiany były widoczne natychmiast.
        return cargo.getId(); //; zwraca cargo po Id
    }

    @Override
    public List<Cargo> getAll() {
        return entityManager.createQuery(JPA_GET_ALL, Cargo.class) // Cargo.class wskazuje bezpośrednio z czego zasysamy dane
                            .getResultList(); // createQuery tworzy zapytanie zdefiniowane w JPA_GET_ALL, .getResultList(); wyrzuca listę wyników.
    }

    @Override
    public void remove(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Cargo cargo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
