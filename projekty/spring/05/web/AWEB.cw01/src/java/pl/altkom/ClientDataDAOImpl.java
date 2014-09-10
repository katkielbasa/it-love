package pl.altkom;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ClientDataDAOImpl implements ClientDataDAO {

	public void saveClientData(Client cl, String dataSource) throws Exception {
		
        InitialContext initCtx = new InitialContext();
		//jdb/jweb-lookup
        DataSource ds = (DataSource) initCtx.lookup(dataSource);
		//jpr-klasa connection-dostęp do bazy danych
        Connection con = null;
        //parametry w SQLu liczone od jedynki(nie-zero)
        try {
	        con = ds.getConnection();
	        
	        PreparedStatement pstmt = con.prepareStatement(
	        "INSERT INTO klient(id,imie,nazwisko,region,wiek,mezczyzna) values (?,?,?,?,?,?)");
			//dla baz które nie wspierają typów logicznych: plec-0:1
	        int m = (cl.isMale() ? 1 : 0);
	        pstmt.setInt(1, generateId());
	        pstmt.setString(2, cl.getName());
	        pstmt.setString(3, cl.getSurname());
	        pstmt.setString(4, cl.getRegion());
	        pstmt.setInt(5, cl.getAge());
	        pstmt.setInt(6, m);
	        
	        pstmt.executeUpdate();
	        pstmt.close();
        } finally {
        	if (con != null) {
        		con.close();
        	}
        }
	}
	//metoda generująca ID po czasie wpisu :); mozna też zastosować autoincrement z bazy danych
	private int generateId() {
		return ((int) (System.currentTimeMillis() % 100000)) + 100000;
	}


}
