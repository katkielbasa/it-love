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
@Repository
public class JdbcRepositoryComputer implements PhoneBookRepository {
        
        private String COMPUTER_SAVE_SQL = "insert into pb_komputer(nazwa,opis) values(?,?)";
	
	private String COMPUTER_FIND_SQL = "select * from pb_komputer";
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void init( DataSource dataSource ) {
		jdbcTemplate = new JdbcTemplate( dataSource );
	}
	
	@Override
	public void save( Entry entry ) {
	//	AssertionUtil.assertCar( entry );
		//przekazywanie wartoœci do bazy danych
		jdbcTemplate.update( COMPUTER_SAVE_SQL,
			new Object[] {
				entry.getComputer().getNazwa(),
				entry.getComputer().getOpis()
			}
		);
	}
	
	@Override
	public List<Entry> findAllEntries() {
		
		List entries = jdbcTemplate.query( COMPUTER_FIND_SQL,
			new RowMapper() {
				@Override
                                //mapujemy rekord z DB na obiekt klasy Entry
                                //pod ResultSet podstawia rekord tzn. ca³y wiersz z bazy danych
				public Object mapRow( ResultSet rs, int index )
						throws SQLException {
					
					Entry entry = EntryUtil.createEntry( EntryCategory.DEFAULT );
					EntryUtil.setComputer( 
							entry, 
							rs.getString( "nazwa" ), 
							rs.getString( "opis" ) 
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
