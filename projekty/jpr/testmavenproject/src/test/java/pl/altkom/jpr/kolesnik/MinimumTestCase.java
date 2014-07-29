package pl.altkom.jpr.kolesnik;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MinimumTestCase {

	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("Odpalam metode inicjalną");
	}

	@Test
	public void testFindMinimalInt1() {
		Minimum c = new Minimum();
		int tab[] = { 4, 5, 2, 5 };
		int wynik = c.findMinimalInt(tab);
		System.out.println();
		assertEquals(2, wynik);
	}

	@Test
	public void testFindMinimalInt2() {
		Minimum c = new Minimum();
		int tab[] = { -10, 5, 2, 5 };
		int wynik = c.findMinimalInt(tab);
		assertEquals(-10, wynik);
	}

	@Test
	public void testFindMinimalInt3() {
		Minimum c = new Minimum();
		int tab[] = {};
		Integer wynik = c.findMinimalInt(tab);
		assertEquals(null, wynik);
	}

	@Test
	public void testFindMinimalInt4() {
		Minimum c = new Minimum();
		int tab[] = null;
		Integer xxx = c.findMinimalInt(tab);
		assertEquals(null, xxx);
	}

	@AfterClass
	public static void cleanUpClass() throws Exception {
		System.out.println("KOńcze testy - czyszcze bazę");

	}

}
