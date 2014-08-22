package altkom.model.repository;

import java.util.List;

import altkom.model.Entry;

public interface PhoneBookRepository {

    abstract void save(Entry entry);

    abstract void update(Entry entry);

    abstract Entry findById(Long id);

//	 abstract List<Entry> findAllEntries();
    abstract List<Entry> findAllCars();

    abstract List<Entry> findAllPersons();

    abstract List<Entry> findAllKomputers();

    abstract void logToSysout();

}
