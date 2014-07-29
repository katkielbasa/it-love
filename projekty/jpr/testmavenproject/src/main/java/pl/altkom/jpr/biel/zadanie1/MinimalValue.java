package pl.altkom.jpr.biel.zadanie1;

//Klasa odpowiedzialna za znajdowanie
//minimalnych wartosci w zbiorach
//

public class MinimalValue { // deklaracja klasy

	public int findMinimalInt(int[] tab) { // pumbliczna metoda typ int bo ma
											// zwracac liczbe int tablicy[] tab
		System.out.println("W przes�anej tablicy jest" + tab.length
				+ "element�w");
		int tymczasowaLiczbaNajmniejsza = tab[0];
		for (int i =1; i<tab.length; i++) {
			if(tymczasowaLiczbaNajmniejsza > tab[i]) {
				tymczasowaLiczbaNajmniejsza = tab[i];
			}
		}
//for (int liczba : tab){
//		if (tymczasowaLiczbaNajmniejsza > liczba) {    ///for - each
//			tymczasowaLiczbaNajmniejsza = liczba
		
		return tymczasowaLiczbaNajmniejsza;

	}

}
