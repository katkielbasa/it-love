package altkom.model.repository;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.EntryCategory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


public class JdbcRepositoryCar implements PhoneBookRepository {
//te dwa Stringi s� komendami dla bazy SQL

    private String CAR_SAVE_SQL = "insert into pb_car(marka,kolor) values(?,?)";
    //tak zapisujemy do bazy
    private String CAR_FIND_SQL = "select * from pb_car";
	//jak chcemy konkretn� rzecz z bazy zamiast gwiazki"*" wpisz np:"name", a jak chcemy konkretny rekord po atrybucie to sk�adnia:
    // select * from pb_persons where name='ala' -zwr�ci wszystkie dane z rekord�w kt�rych atrybut imi� r�wna si� ala
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Entry entry) {

        jdbcTemplate.update(CAR_SAVE_SQL,
                new Object[]{
                    entry.getCar().getMarka(),
                    entry.getCar().getKolor()
                }
        );
    }

    @Override
    public List<Entry> findAllEntries() {

        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int index)
                    throws SQLException {

                Entry entry = new Entry();
                entry.setCategory(EntryCategory.DEFAULT);

                Car car = entry.getCar();

                car.setMarka(rs.getString("marka"));
                car.setKolor(rs.getString("kolor"));

                entry.setCar(car);

                return entry;
            }
        };

        List entries = jdbcTemplate.query(CAR_FIND_SQL, rowMapper);

        return entries;
    }

    @Override
    public void update(Entry entry) {

		// TODO Auto-generated method stub
    }

    @Override
    public Entry findById(Long id) {

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
//	
}
