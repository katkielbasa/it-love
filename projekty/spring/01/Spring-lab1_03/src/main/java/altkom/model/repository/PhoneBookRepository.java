package altkom.model.repository;

import altkom.model.Car;
import java.util.List;

import altkom.model.Entry;

public interface PhoneBookRepository {

    public abstract void save(Entry entry);

    public abstract void update(Entry entry);

    public abstract Entry findById(Long id);

    public abstract List<Entry> findAllEntries();

    public abstract void logToSysout();

    public abstract List<Car> findAllCars();
}
