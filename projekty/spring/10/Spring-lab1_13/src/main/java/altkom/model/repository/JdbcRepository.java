package altkom.model.repository;

import java.util.List;

import altkom.model.Entry;
import altkom.model.util.AssertionUtil;


public class JdbcRepository implements PhoneBookRepository {

	private String PERSON_SAVE_SQL = "insert into pb_persons(name,surname) values(?,?);";
	
	private String PERSON_FIND_SQL = "select * from pb_persons;";
	
	@Override
	public void save( Entry entry ) {
		AssertionUtil.assertPerson( entry );
		//TODO zaimplementuj
	}
	
	@Override
	public List<Entry> findAllEntries() {
		
		List entries = null;
		
		//TODO zaimplementuj
		
		return entries;
	}
	
	@Override
	public void update( Entry entry ) {
	
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Entry findById( Long id ) {
	
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void logToSysout() {
	
	}
	
}
