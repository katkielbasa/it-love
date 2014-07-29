package pl.altkom.jpr.instruktor;

/**
 * Klasa odpowiedzialna za znajdowanie
 * minimalnych wartości w zbiorach
 * @author instruktor
 *
 */
public class MinimalValueSearcher {

	
	public Integer findMinimalInt(int[] tab){
		
		if (tab == null ){
			return null;
		}
		if (tab.length == 0 ){
			return null;
		}
		
		System.out.println("W przesłanej tablicy jest "+tab.length + " elementow");
		
		int tymczasowaLiczbaNajmniejsza = tab[0];
//		for (int i = 1; i < tab.length; i++) {
//			if (tymczasowaLiczbaNajmniejsza > tab[i] ){
//				tymczasowaLiczbaNajmniejsza = tab[i];
//			}
//		}
		for (int liczba : tab) {
			if (tymczasowaLiczbaNajmniejsza > liczba ){
				tymczasowaLiczbaNajmniejsza = liczba;
			}
		}
		return tymczasowaLiczbaNajmniejsza;

	}
	
	
	
}
