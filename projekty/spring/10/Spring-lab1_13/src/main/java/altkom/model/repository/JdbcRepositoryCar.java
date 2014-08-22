/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model.repository;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.EntryCategory;

import altkom.model.util.AssertionUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kursant10
 */

    
//@Repository
public class JdbcRepositoryCar implements PhoneBookRepository {

	private String CAR_SAVE_SQL = "insert into pb_car(marka,kolor) values(?,?)";
	
	private String CAR_FIND_SQL = "select * from pb_car";
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void init( DataSource dataSource ) {
		jdbcTemplate = new JdbcTemplate( dataSource );
	}
	
    
@Override
	public void save( Entry entry ) {
		
		
                Object[] objects = {entry.getCar().getMarka(),
                                    entry.getCar().getKolor() };
                
		jdbcTemplate.update( CAR_SAVE_SQL, objects);
	}
	
	@Override
	public List<Entry> findAllEntries() {
		
		
		RowMapper rowMapper = new RowMapper() {
				@Override
				public Object mapRow( ResultSet rs, int index )
						throws SQLException {
					
					Entry entry = new Entry();
                                        entry.setCategory( EntryCategory.DEFAULT );
                                        
                                        Car car = entry.getCar();
		
                                        car.setMarka( rs.getString( "marka" ));
                                        car.setKolor( rs.getString( "kolor" ) );
					
                                        entry.setCar(car);
                                        
					return entry;
				}
                };		
		
                List entries = jdbcTemplate.query( CAR_FIND_SQL, rowMapper);
                                
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

