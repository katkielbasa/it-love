package altkom.model.repository;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.Komputer;
import java.util.List;
import java.util.Map;

public interface PhoneBookRepository {

	public abstract void save( Entry entry );

	public abstract void update( Entry entry );

	public abstract Entry findById( Long id );

	public abstract List<Entry> findAllEntries();
	
	public abstract void logToSysout();
        
         abstract void setCars(Map<Long, Car> cars) ;
        
         abstract void setCarsAsList(List<Car> cars);
		
	abstract List<Car> findAllCars();
        
        abstract void setComps(Map<Long, Komputer> comps) ;
        
         abstract void setCompsAsList(List<Komputer> comps);
		
	abstract List<Komputer> findAllComps();

}