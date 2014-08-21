package altkom.model.repository;

import altkom.model.Car;
import java.util.List;

import altkom.model.Entry;
import altkom.model.Komputer;
import java.util.Map;

public interface PhoneBookRepository {

	public abstract void save( Entry entry );

	public abstract void update( Entry entry );

	public abstract Entry findById( Long id );

	public abstract List<Entry> findAllEntries();
	
	public abstract void logToSysout();
        
        abstract void setCarsAsList(List<Car> cars);
        
        abstract void setCars(Map<Long, Car> cars);
        
        abstract List<Car> findAllCars();
                
        abstract void setKomputers(Map<Long, Komputer> komputers);
        
        abstract void setKomputersAsList(List<Komputer> komputers);
        
        abstract List<Komputer> findAllKomputers();
}