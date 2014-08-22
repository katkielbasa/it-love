/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model.repository;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.EntryCategory;
import altkom.model.Komputer;
import altkom.model.Person;
import altkom.model.util.AssertionUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kursant5
 */
@Repository
public class JdbcRepositoryCar implements PhoneBookRepository {

    private final String CAR_SAVE_SQL = "insert into pb_car(marka,kolor) values(?,?)";
    private final String CAR_FIND_SQL = "select * from pb_car";
    private final String PERSON_SAVE_SQL = "insert into pb_persons(name,surname) values(?,?)";
    private final String PERSON_FIND_SQL = "select * from pb_persons";
    private final String KOMPUTER_SAVE_SQL = "insert into pb_komputer(opis,nazwa) values(?,?)";
    private final String KOMPUTER_FIND_SQL = "select * from pb_komputer";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void save(Entry entry) {
        AssertionUtil.assertPerson(entry);

        Object[] objects = {entry.getCar().getMarka(),
            entry.getCar().getKolor()};
        Object[] persons = {entry.getPerson().getName(),
            entry.getPerson().getSurname()};
        Object[] komputer = {entry.getKomputer().getNazwa(),
                             entry.getKomputer().getOpis()};
        
        jdbcTemplate.update(CAR_SAVE_SQL, objects);
        jdbcTemplate.update(PERSON_SAVE_SQL, persons);
        jdbcTemplate.update(KOMPUTER_SAVE_SQL, komputer);
    }
    @Override
    public List<Entry> findAllCars() {
        RowMapper rowMapper = new RowMapper() {

            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
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
    public List<Entry> findAllPersons() {
        RowMapper rowMapper = new RowMapper() {

            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
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
    public List<Entry> findAllKomputers() {
        RowMapper rowMapper = new RowMapper() {

            @Override
            public Object mapRow(ResultSet rs, int i) throws SQLException {
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
    public void logToSysout() {

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
}
