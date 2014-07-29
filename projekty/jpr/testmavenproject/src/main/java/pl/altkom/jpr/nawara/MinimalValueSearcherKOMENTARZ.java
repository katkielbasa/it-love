package pl.altkom.jpr.nawara;

// klasa odpowiedzialna za znajdowanie minimal. warto�ci w zbiorach
public class MinimalValueSearcherKOMENTARZ {

	public int findMinimalInt(int[] tab) {

		System.out.println("W przes�anej tablicy jest " + tab.length
				+ " elementow");

		/**
		 * Przy obecnej konstrukcji program nie przejdzie testow dla podania
		 * pustej tabeli oraz dla zerowej dlugosci tabeli - czytaj: wywali sie
		 * dla 2 testow:
		 * 
		 * @Test public void testFindMinimalInt3() { MinimalValueSearcher c =
		 *       new MinimalValueSearcher(); int tab[] = {}; Integer wynik =
		 *       c.findMinimalInt(tab); assertEquals(null, wynik); }
		 * @Test public void testFindMinimalInt4() { MinimalValueSearcher c =
		 *       new MinimalValueSearcher(); int tab[] = null; Integer wynik =
		 *       c.findMinimalInt(tab); assertEquals(null, wynik); }
		 * 
		 * 
		 *       if (tab == null){ return null; }
		 * 
		 *       if (tab.length == 0) { return null; }
		 *       
		 *       @author znitecki
		 */

		int tymczasowaLiczbaNajmniejsza = tab[0];
		for (int i = 1; i < tab.length; i++) {
			if (tymczasowaLiczbaNajmniejsza > tab[i]) {
				tymczasowaLiczbaNajmniejsza = tab[i];
			}
		}

		// return 0;
		return tymczasowaLiczbaNajmniejsza;

	}

	// testowanie tutaj-przenios�am do nowej klasy
	/*
	 * public static void main(String args[]) { MinimalValueSearcher obj = new
	 * MinimalValueSearcher(); int[] liczby = new int[3]; liczby[0]=4;
	 * liczby[1]=7; liczby[2]=2;
	 * 
	 * obj.findMinimalInt(liczby);
	 */
	public MinimalValueSearcherKOMENTARZ() {
		System.out.println("w�asnie jest stworzony");
	}
}
