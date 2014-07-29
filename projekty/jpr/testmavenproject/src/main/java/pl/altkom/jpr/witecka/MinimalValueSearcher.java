package pl.altkom.jpr.witecka;
//Klasa jest odpowiedzialna za wyszukiwanie najmniejszej warto�ci.

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

		return tymczasowaLiczbaNajmniejsza;

	}

	public static void main(String[] args) {

		MinimalValueSearcher obj = new MinimalValueSearcher();

		int[] liczby = new int[3];
		liczby[0] = 4;
		liczby[1] = 7;
		liczby[2] = 2;

		System.out.println(obj.findMinimalInt(liczby));

	}
}