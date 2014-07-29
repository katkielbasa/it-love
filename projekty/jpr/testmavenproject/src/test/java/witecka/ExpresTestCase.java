package witecka;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.altkom.jpr.rosinska.Ekspres;

public class ExpresTestCase {

	@Test
	

public void test (){
	Ekspres a = new Ekspres ();
	
	double wynik= a.calculatePayment("dzis", 30, true);
	assertTrue(wynik ==34);
	
}
}
