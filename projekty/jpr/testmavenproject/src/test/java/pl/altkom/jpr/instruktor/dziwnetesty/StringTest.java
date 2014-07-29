package pl.altkom.jpr.instruktor.dziwnetesty;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testSplitString() {

		String[] wynik = "adam1kowalski".split("[0-9]");
		assertEquals("adam", wynik[0]);
		assertEquals("kowalski", wynik[1]);
		assertEquals(2, wynik.length);

		
		  
	}

	@Test
	public void testToLowerCase() {
		String wynik = "AAa".toLowerCase();
		assertEquals("aaa", wynik);
	}

	@Test
	public void testToUpperCase() {
		String wynik = "aaa".toUpperCase();
		assertEquals("AAA", wynik);
	}

}
