package pl.altkom.jpr.nitecki;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableGeneratorTestCase {

	@Test
	public void testTableGenerator1() {
		TableGenerator gen = new TableGenerator();
		int tab[] = new int[10];
		gen.generateNumbers(10);
		assertEquals(10, tab.length);

	}

	@Test
	public void testTableGenerator2() {
		TableGenerator gen = new TableGenerator();
		int tab[] = new int[0];
		gen.generateNumbers(0);
		assertEquals(0, tab.length);

	}

	@Test
	public void testTableGenerator3() {
		TableGenerator gen = new TableGenerator();
		int tab[] = new int[0];
		gen.generateNumbers(300);
		assertEquals(0, tab.length);

	}
}
