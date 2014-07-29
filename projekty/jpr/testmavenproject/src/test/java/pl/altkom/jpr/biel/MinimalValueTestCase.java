package pl.altkom.jpr.biel;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import pl.altkom.jpr.biel.zadanie1.MinimalValue;




public class MinimalValueTestCase {
	
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Odpalam metode inicjalną");
	}
	

	@Test
	public void testFindMinimalInt1() {
		MinimalValue c = new MinimalValue();	
		int tab[] = {4,5,2,5};
		int wynik = c.findMinimalInt(tab);
		assertEquals(2, wynik);
			
	}
	
	
	
	@AfterClass
	public static void cleanUpClass() throws Exception {
		System.out.println("KOńcze testy - czyszcze bazę");
		
		
	}
}
