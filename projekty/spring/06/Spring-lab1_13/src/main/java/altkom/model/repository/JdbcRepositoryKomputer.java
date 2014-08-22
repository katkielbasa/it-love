package altkom.model.repository;


import altkom.model.Entry;
import altkom.model.EntryCategory;
import altkom.model.Komputer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepositoryKomputer implements PhoneBookRepository {
//te dwa Stringi s¹ komendami dla bazy SQL

    private String KOMPUTER_SAVE_SQL = "insert into pb_komputer(nazwa,opis) values(?,?)";
    //tak zapisujemy do bazy
    private String KOMPUTER_FIND_SQL = "select * from pb_komputer";
	//jak chcemy konkretn¹ rzecz z bazy zamiast gwiazki"*" wpisz np:"name", a jak chcemy konkretny rekord po atrybucie to sk³adnia:
    // select * from pb_persons where name='ala' -zwróci wszystkie dane z rekordów których atrybut imiê równa siê ala
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Entry entry) {

        jdbcTemplate.update(KOMPUTER_SAVE_SQL,
                new Object[]{
                    entry.getKomputer().getNazwa(),
                    entry.getKomputer().getOpis()
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

                Komputer komputer = entry.getKomputer();

                komputer.setNazwa(rs.getString("nazwa"));
                komputer.setOpis(rs.getString("opis"));

                entry.setKomputer(komputer);

                return entry;
            }
        };

        List entries = jdbcTemplate.query(KOMPUTER_FIND_SQL, rowMapper);

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
