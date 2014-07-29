package pl.altkom.jpr.nitecki;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SorterTestCase {

	@Test
	public void testSorter1() {
		Sorter c = new Sorter();
		int tab[] = { 4, 5, 2, 5 };
		c.bubbleSort(tab);
		assertEquals(2, tab[0]);
		assertEquals(4, tab[1]);
		assertEquals(5, tab[2]);
		assertEquals(5, tab[3]);

	}

	@Test
	public void testSorter2() {
		Sorter c = new Sorter();
		int tab[] = {};
		c.bubbleSort(tab);
		assertEquals(0, tab.length);

	}
	
	@Test
	public void testSorter3() {
		Sorter c = new Sorter();
		int tab[] = null;
		c.bubbleSort(tab);
		assertEquals(null, tab);

	}
}