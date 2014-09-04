package pl.training.services;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import pl.training.entity.Client;

@Stateless
public class JpaClientsRepository implements ClientsRepository {

    private static final String JPQ_QUERY_ALL = "select c from Client c";

    @PersistenceContext(unitName = "itlove")
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
        return entityManager.createQuery(JPQ_QUERY_ALL, Client.class)
                .getResultList();
    }

    @Override
    public List<Client> getAll(FilterType filterType, String value) {
        Query query;
        switch (filterType) {
            case LAST_NAME:
                query = entityManager
                        .createQuery("select c from Client c where c.lastName like :lastName", Client.class)
                        .setParameter("lastName", value + "%"); //dwukropek pozwala na stworzenie nazwanego parametru
                break;
            case FIRST_NAME:
                query = entityManager
                        .createQuery("select c from Client c where c.firstName like :firstName", Client.class)
                        .setParameter("firstName", value + "%");//"%" - dowolna liczba dowolnych znaków
                break;
            case SEX:
                query = entityManager // = zamiast like bo mamy konkretną wartość
                        .createQuery("select c from Client c where c.sex = :sex", Client.class)
                        .setParameter("sex", Client.Sex.valueOf(value)); //"%" nie ma, bo nie ma tu dowolnej ilości dowonych znakow
                break;
            case IS_PARENT:
                query = entityManager
                        .createQuery("select c from Client c where c.parent like :parent", Client.class)
                        .setParameter("parent", Boolean.valueOf(value)); //dwukropek pozwala na stworzenie nazwanego parametru
                break;
            case AGE:
                Calendar now = Calendar.getInstance();
                now.add(Calendar.YEAR, -Integer.parseInt(value));
                now.set(Calendar.MONTH, 1);
                now.set(Calendar.DAY_OF_MONTH, 1);
                Date start = now.getTime();
                now.set(Calendar.MONTH, 12);
                now.set(Calendar.DAY_OF_MONTH, 31);
                Date end = now.getTime();
                query = entityManager
                        .createQuery("select c from Client c where c.dateOfBirth BETWEEN :start and :end", Client.class)
                        .setParameter("start", start)
                        .setParameter("end", end);
                break;
            default:
                throw new IllegalArgumentException();
        }
        return query.getResultList();
    }
}
