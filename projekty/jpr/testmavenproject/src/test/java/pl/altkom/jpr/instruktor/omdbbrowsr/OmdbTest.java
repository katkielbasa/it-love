package pl.altkom.jpr.instruktor.omdbbrowsr;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.altkom.jpr.instruktor.omdb.OmdbBrowserApi;


public class OmdbTest {

	 

	@Test
	public void testFindMinimalInt1() {
		
		OmdbBrowserApi ba = new OmdbBrowserApi();
		
		ba.searchMovie("Miś");
		
	}

	 

}
