package altkom.model.repository;

import altkom.model.Car;
import altkom.model.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository implements PhoneBookRepository {

	private Map<Long, Entry> entries = new HashMap<Long, Entry>();
	private Map<Long,Car> cars = new HashMap<Long,Car>();

    public Map<Long, Car> getCars() {
        return cars;
    }

    public void setCars(Map<Long, Car> cars) {
        this.cars = cars;
    }
      public void setCarsAsList(List<Car> cars) {
		this.cars.clear();
		for(Car car : cars){
			this.cars.put((Long)car.getKey(),car);
		}  
      }
      
	@Override
	public void save( Entry entry ) {
		final boolean notSavedYet = ( entry.getId() == null );
		if ( notSavedYet ) {
			entry.setId( determineId() );
		}
		
		entries.put( entry.getId(), entry );
	}
	
	@Override
	public void update( Entry entry ) {
		//mb: nothing to do
	}
	
	@Override
	public Entry findById( Long id ) {
		return (Entry) entries.get( id );
	}
	
	@Override
	public List<Entry> findAllEntries() {
		return new ArrayList<Entry>( entries.values() );
	}
	@Override
	public List<Car> findAllCars() {
		return new ArrayList<Car>( cars.values() );
	}
	@Override
	public void logToSysout() {
		System.out.println("Aktualny stan bazy = " + entries );
	}
	
	private Long determineId() {
		return new Long( entries.keySet().size() + 1 );
	}

	public void setEntries(Map<Long, Entry> entries) {
		this.entries = entries;
	}

	public void setEntriesAsList(List<Entry> entries) {
		this.entries.clear();
		for(Entry entry : entries){
			this.entries.put(entry.getId(), entry);
		}
	}

}
