package pl.training.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.training.entity.Client;

@Stateless
public class JpaClientsRepository implements ClientsRepository {

    private static final String JPA_QUERY_ALL = "select c from Client c";
    @PersistenceContext(unitName = "It-love")
    private EntityManager entityManager;

    @Override
    public Long add(Client client) {
        entityManager.persist(client);
        entityManager.flush();
        entityManager.refresh(client);
        return client.getId();
    }

    @Override
    public List<Client> getAll() {
        return entityManager.createQuery(JPA_QUERY_ALL, Client.class).getResultList();
//        return new ArrayList<>();

    }

    @Override
    public List<Client> getAll(FilterType filterType, String value) {
        Query query;
        switch (filterType) {
            case LAST_NAME:
                query = entityManager.createQuery("select c from Client c where c.lastName like :lastName", Client.class).setParameter("lastName", value + "%");
                break;
            default:
                throw new IllegalArgumentException();
        }
        return query.getResultList();

    }

}
