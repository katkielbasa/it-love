package pl.altkom.jpr.szymanski;

import static org.junit.Assert.*;

import org.junit.Test;


public class CalculateDane1TestCase {

	@Test
	public void testCalculateDane11() {
		Dane dane1 = new Dane(1, 10, true);
		
		CalculateDane1 oblicz = new CalculateDane1();
		
		Float wynik = oblicz.CalculateDane(dane1);
		System.out.println(wynik);
		assertTrue(wynik==9.5);
	}

}
