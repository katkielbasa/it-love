package pl.altkom.jpr.nawara;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.altkom.jpr.instruktor.MinimalValueSearcher;
import pl.altkom.jpr.rosinska.Ekspres;

public class EkspresTestCase {

	@Test
	public void test() {
		Ekspres a = new Ekspres();	
		
		double wynik = a.calculatePayment("dzis", 30, true);
		assertTrue(wynik == 34);
		
	}

	@Test
	public void test2() {
		Ekspres a = new Ekspres();	
		
		double wynik = a.calculatePayment("jutro", 30, false);
		assertTrue(wynik == 16.5);
	
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
		Integer xxx = c.findMinimalInt(tab);
		assertEquals(null, xxx);
}
}

