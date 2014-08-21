package altkom.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import altkom.model.Entry;

@Repository( "inMemoryRepository" )
public class InMemoryRepository implements PhoneBookRepository {

	private Map entries = new HashMap();
	
	/* (non-Javadoc)
	 * @see altkom.model.repository.PhoneBookRepository#save(altkom.model.Entry)
	 */
	public void save( Entry entry ) {
		final boolean notSavedYet = ( entry.getId() == null );
		if ( notSavedYet ) {
			entry.setId( determineId() );
		}
		
		entries.put( entry.getId(), entry );
	}
	
	/* (non-Javadoc)
	 * @see altkom.model.repository.PhoneBookRepository#update(altkom.model.Entry)
	 */
	public void update( Entry entry ) {
		
	}
	
	/* (non-Javadoc)
	 * @see altkom.model.repository.PhoneBookRepository#findById(java.lang.Long)
	 */
	public Entry findById( Long id ) {
		return (Entry) entries.get( id );
	}
	
	/* (non-Javadoc)
	 * @see altkom.model.repository.PhoneBookRepository#findAllEntries()
	 */
	public List findAllEntries() {
		return new ArrayList( entries.values() );
	}
	
	@Override
	public void logToSysout() {
		System.out.println("Aktualny stan bazy = " + entries );
	}
	
	private Long determineId() {
		return new Long( entries.keySet().size() + 1 );
	}
	
}
