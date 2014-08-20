package altkom.model.repository;

import altkom.model.Car;
import java.util.List;

import altkom.model.Entry;
import java.util.Map;

public interface PhoneBookRepository {

    abstract void save(Entry entry);

    abstract void update(Entry entry);

    abstract Entry findById(Long id);

    abstract List<Entry> findAllEntries();

    abstract void logToSysout();

    abstract void setCars(Map<Long, Car> cars);

    abstract void setCarsAsList(List<Car> cars);

    abstract List<Car> findAllCars();
}
