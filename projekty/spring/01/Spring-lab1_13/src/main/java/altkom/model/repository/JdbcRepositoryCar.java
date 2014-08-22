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
public class JdbcRepositoryCar implements PhoneBookRepository {
        
        private String CAR_SAVE_SQL = "insert into pb_persons2(marka,kolor) values(?,?)";
	
	private String CAR_FIND_SQL = "select * from pb_persons2";
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void init( DataSource dataSource ) {
		jdbcTemplate = new JdbcTemplate( dataSource );
	}
	
	@Override
	public void save( Entry entry ) {
	//	AssertionUtil.assertCar( entry );
		//przekazywanie wartoœci do bazy danych
		jdbcTemplate.update( CAR_SAVE_SQL,
			new Object[] {
				entry.getCar().getMarka(),
				entry.getCar().getKolor()
			}
		);
	}
	
	@Override
	public List<Entry> findAllEntries() {
		
		List entries = jdbcTemplate.query( CAR_FIND_SQL,
			new RowMapper() {
				@Override
                                //mapujemy rekord z DB na obiekt klasy Entry
                                //pod ResultSet podstawia rekord tzn. ca³y wiersz z bazy danych
				public Object mapRow( ResultSet rs, int index )
						throws SQLException {
					
					Entry entry = EntryUtil.createEntry( EntryCategory.DEFAULT );
					EntryUtil.setCar( 
							entry, 
							rs.getString( "marka" ), 
							rs.getString( "kolor" ) 
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
