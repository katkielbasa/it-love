package altkom.model.repository;

import altkom.model.Entry;
import altkom.model.EntryCategory;
import altkom.model.Person;
import altkom.model.util.AssertionUtil;
import altkom.model.util.EntryUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

//@Repository
public class JdbcRepository implements PhoneBookRepository {

    private String PERSON_SAVE_SQL = "insert into pb_persons(name,surname) values(?,?)";

    private String PERSON_FIND_SQL = "select * from pb_persons";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Entry entry) {
        AssertionUtil.assertPerson(entry);

        Object[] objects = {entry.getPerson().getName(),
            entry.getPerson().getSurname()};

        jdbcTemplate.update(PERSON_SAVE_SQL, objects);
    }

    public List<Entry> findAllEntries() {

        RowMapper rowMapper = new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int index)
                    throws SQLException {

                Entry entry = new Entry();
                entry.setCategory(EntryCategory.DEFAULT);

                Person person = entry.getPerson();

                person.setName(rs.getString("name"));
                person.setSurname(rs.getString("surname"));

                entry.setPerson(person);

                return entry;
            }
        };

        List entries = jdbcTemplate.query(PERSON_FIND_SQL, rowMapper);

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

    @Override
    public List<Entry> findAllCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entry> findAllPersons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Entry> findAllKomputers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
