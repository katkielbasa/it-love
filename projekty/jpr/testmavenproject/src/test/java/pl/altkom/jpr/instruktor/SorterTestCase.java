package pl.altkom.jpr.instruktor;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class SorterTestCase {

	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Odpalam metode inicjalną");
	}

	@Test
	public void testFindMinimalInt1() {
		ValueSorter vs = new ValueSorter();
		
	}

	@AfterClass
	public static void cleanUpClass() throws Exception {
		System.out.println("KOńcze testy - czyszcze bazę");

	}

}
