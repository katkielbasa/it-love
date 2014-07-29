package pl.altkom.jpr.kowalski;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.altkom.jpr.kowalski.oplata.Prowizja;

public class ProwizjaCaseTester {

	@Test
	public void testTax1() {
		Prowizja p = new Prowizja();
		//zmienna
		p.setKwota(-10);
		//jako argument metody obiektu
		
		//metoda testujaca
		assertEquals(p, null);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testTax2() {
		Prowizja p = new Prowizja();
		//zmienna
		p.setKwota(-10);
		//jako argument metody obiektu
		
		//metoda testujaca
		assertEquals(p, null);
		//fail("Not yet implemented");
	}

}
