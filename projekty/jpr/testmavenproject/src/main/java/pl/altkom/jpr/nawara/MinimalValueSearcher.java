package pl.altkom.jpr.nawara;

// klasa odpowiedzialna za znajdowanie minimal. warto�ci w zbiorach
public class MinimalValueSearcher {

	public int findMinimalInt(int[] tab) {

		System.out.println("W przes�anej tablicy jest " + tab.length
				+ " elementow");

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
	public MinimalValueSearcher(){
		System.out.println("w�asnie jest stworzony");
	}
}
