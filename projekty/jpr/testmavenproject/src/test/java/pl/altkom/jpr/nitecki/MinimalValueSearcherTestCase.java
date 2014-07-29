package pl.altkom.jpr.nitecki;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinimalValueSearcherTestCase {

	
	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Odpalam metode inicjalną");
	}
	
	@Test
	public void testFindMinimalInt1() {
		MinimalValueSearcher c = new MinimalValueSearcher();	
		int tab[] = {4,5,2,5};
		int wynik = c.findMinimalInt(tab);
		assertEquals(2, wynik);
	}

	@Test
	public void testFindMinimalInt2() {
		MinimalValueSearcher c = new MinimalValueSearcher();	
		int tab[] = {-10,5,2,5};
		int wynik = c.findMinimalInt(tab);
		assertEquals(-10, wynik);
	}
	
	@Test
	public void testFindMinimalInt3() {
		MinimalValueSearcher c = new MinimalValueSearcher();	
		int tab[] = {};
		Integer wynik = c.findMinimalInt(tab);
		assertEquals(null, wynik);
	}
	
	@Test
	public void testFindMinimalInt4() {
		MinimalValueSearcher c = new MinimalValueSearcher();	
		int tab[] = null;
		Integer wynik = c.findMinimalInt(tab);
		assertEquals(null, wynik);
	}
	
	@Test
	public void testFindMinimalInt5() {
		MinimalValueSearcher c = new MinimalValueSearcher();
		int tab[] = {-10, 2, 3, 4};
		int wynik = c.findMinimalInt(tab);
		assertEquals(-10, wynik);
	}
	
	@Test
	public void testFindMinimalInt6() {
		MinimalValueSearcher c = new MinimalValueSearcher();
		int tab[] = {4, 4, 4, 4};
		int wynik = c.findMinimalInt(tab);
		assertEquals(4, wynik);
	}
	
	@Test
	public void testFindMinimalInt7() {
		MinimalValueSearcher c = new MinimalValueSearcher();
		int tab[] = {-23135, -352343, -35623456, -36246};
		int wynik = c.findMinimalInt(tab);
		assertEquals(-35623456, wynik);
	}
	
	@AfterClass
	public static void cleanUpClass() throws Exception {
		System.out.println("KOńcze testy - czyszcze bazę");
		
		
	}
	
	 
}
