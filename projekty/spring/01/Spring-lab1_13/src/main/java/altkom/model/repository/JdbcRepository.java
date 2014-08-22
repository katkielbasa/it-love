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
//szuka klasy ktora implementuje interfejs phbookrep.i ma @
//@Repository
public class JdbcRepository implements PhoneBookRepository {

	private String PERSON_SAVE_SQL = "insert into pb_persons(name,surname) values(?,?)";
	
	private String PERSON_FIND_SQL = "select * from pb_persons";
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void init( DataSource dataSource ) {
		jdbcTemplate = new JdbcTemplate( dataSource );
	}
	
	@Override
	public void save( Entry entry ) {
		AssertionUtil.assertPerson( entry );
		//przekazywanie warto�ci do bazy danych
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
                                //mapujemy rekord z DB na obiekt klasy Entry
                                //pod ResultSet podstawia rekord tzn. ca�y wiersz z bazy danych
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
	
}
