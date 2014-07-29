package pl.altkom.jpr.rosinska;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test2 {

	@Test
	public void test1() {
		Teraz t = new Teraz();
		double x = 20;
		double w = t.poczta(x);
		assertTrue(w == 15d);
	}

	@Test
	public void test2() {
		Teraz t = new Teraz();
		double x = 20;
		double w = t.poczta(x);
		assertTrue(w == 15d);
	}
	
	@Test
	public void test3() {
		Ekspres e = new Ekspres();
		String t = "teraz"; //typ 
		double w = 20; // wartość
		boolean c = true; // czy internet
		double wynik = e.calculatePayment(t, w, c);
		assertTrue(wynik == 9.5);
		
	}
	

	
}
