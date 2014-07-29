package pl.altkom.jpr.kolesnik;

//ta klasa wyszukuje minimalna wartosc

public class Minimum {

	public Integer findMinimalInt(int[] tab) {
		if (tab == null ){
			return null;
		}
		if (tab.length == 0 ){
			return null;
		}
		   
		int tymczasowaLiczbaNajmniejsza = tab[0];
		// for (int i = 1; i < tab.length;i++) {
		// if (tymczasowaLiczbaNajmniejsza > tab[i]) {
		// tymczasowaLiczbaNajmniejsza = tab[i];
		// }
		//

		for (int liczba : tab) {
			if (tymczasowaLiczbaNajmniejsza > liczba) {
				tymczasowaLiczbaNajmniejsza = liczba;

			}
		}
		return tymczasowaLiczbaNajmniejsza;

	}

}
