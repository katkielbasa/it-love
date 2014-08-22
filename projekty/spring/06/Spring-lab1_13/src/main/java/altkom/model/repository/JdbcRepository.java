
package altkom.model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import altkom.model.Entry;
import altkom.model.EntryCategory;
import altkom.model.util.AssertionUtil;
import altkom.model.util.EntryUtil;


public class JdbcRepository implements PhoneBookRepository {
//te dwa Stringi s¹ komendami dla bazy SQL
	private String PERSON_SAVE_SQL = "insert into pb_persons(name,surname) values(?,?)";
        //tak zapisujemy do bazy
	private String PERSON_FIND_SQL = "select * from pb_persons";
	//jak chcemy konkretn¹ rzecz z bazy zamiast gwiazki"*" wpisz np:"name", a jak chcemy konkretny rekord po atrybucie to sk³adnia:
        // select * from pb_persons where name='ala' -zwróci wszystkie dane z rekordów których atrybut imiê równa siê ala
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void init( DataSource dataSource ) {
		jdbcTemplate = new JdbcTemplate( dataSource );
	}
	
	@Override
	public void save( Entry entry ) {
		AssertionUtil.assertPerson( entry );
		
		jdbcTemplate.update( PERSON_SAVE_SQL,
			new Object[] {
				entry.getPerson().getName(),
				entry.getPerson().getSurname()
			}
		);
	}
	
	@Override
	public List<Entry> findAllEntries() {
		
		List entries = jdbcTemplate.query( PERSON_FIND_SQL,
			new RowMapper() {
				@Override
				public Object mapRow( ResultSet rs, int index )
						throws SQLException {
					
					Entry entry = EntryUtil.createEntry( EntryCategory.DEFAULT );
					EntryUtil.setPerson( 
							entry, 
							rs.getString( "name" ), 
							rs.getString( "surname" ) 
					);
					
					return entry;
				}
			}
		);
		
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
//        @Override
//	public void save( Entry entry ) {
//		AssertionUtil.assertPerson( entry );
//		
//                Object[] objects = {entry.getPerson().getName(),
//                                    entry.getPerson().getSurname() };
//                
//		jdbcTemplate.update( PERSON_SAVE_SQL, objects);
//	}
//	
//	@Override
//	public List<Entry> findAllEntries() {
//		
//		
//		RowMapper rowMapper = new RowMapper() {
//				@Override
//				public Object mapRow( ResultSet rs, int index )
//						throws SQLException {
//					
//					Entry entry = new Entry();
//                                        entry.setCategory( EntryCategory.DEFAULT );
//                                        
//                                        Person person = entry.getPerson();
//		
//                                        person.setName( rs.getString( "name" ));
//                                        person.setSurname( rs.getString( "surname" ) );
//					
//                                        entry.setPerson(person);
//                                        
//					return entry;
//				}
//                };		
//		
//                List entries = jdbcTemplate.query( PERSON_FIND_SQL, rowMapper);
//                                
//		return entries;
//	}
}