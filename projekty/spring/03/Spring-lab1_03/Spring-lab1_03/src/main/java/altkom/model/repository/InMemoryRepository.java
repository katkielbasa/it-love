package altkom.model.repository;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.Komputer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryRepository implements PhoneBookRepository {

	private Map<Long, Entry> entries = new HashMap<Long, Entry>();
        private Map<Long, Car> samochody = new HashMap<Long, Car>();
        private Map<Long, Komputer> kompy = new HashMap<Long, Komputer>();
	
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
		return new ArrayList<Car>( samochody.values());
	}
        @Override
        public List<Komputer> findAllKomputers() {
		return new ArrayList<Komputer>( kompy.values());
	}
	
	@Override
	public void logToSysout() {
		System.out.println("Aktualny stan bazy = " + entries );
	}
	
	private Long determineId() {
		return new Long( entries.keySet().size() + 1 );
	}

	public void setEntries(Map<Long, Entry> entries) {//Entries to mapa
		this.entries = entries;
	}

	public void setEntriesAsList(List<Entry> entries) {//id jest w klasie Entry
		this.entries.clear();
		for(Entry entry : entries){
			this.entries.put(entry.getId(), entry);
                }
        }
        
        public void setCars(Map<Long, Car> samochody) {
		this.samochody = samochody;

        }
        
        public void setCarAsList(List<Car> samochody){
		this.samochody.clear();
		for(Car car : samochody){
			this.samochody.put(car.getKey(),car);
		}
       
        }
        
         public void setKomputers(Map<Long, Komputer> kompy) {
		this.kompy = kompy;
         }
        public void setKomputerAsList(List<Komputer> kompy){
		this.kompy.clear();
		for(Komputer k : kompy){
			this.kompy.put(k.getId(),k);
		}
	}

}
