package pl.altkom.jpr.jarema;
// klasa odpowiedzialna za znajdowanie 
//minimalnych warto�ci w zbiorach
public class MinimalValueSearcher {

	public int findMinimalInt(int[] tab){
		
		System.out.println("w przeslanej tablicy jest " + tab.length + "elementow");
		int tymczasowaLiczbaNajmniejsza= tab[0];
		for (int i=1; i < tab.length; i++){
			if (tymczasowaLiczbaNajmniejsza > tab[i]){
				tymczasowaLiczbaNajmniejsza = tab[i];
			}
		}
		return tymczasowaLiczbaNajmniejsza;
}
	public static void main(String args[]){// zeby sprawdzic samemu czy metoda dziala
		MinimalValueSearcher obj= new MinimalValueSearcher();
		int[] liczby = new int [3];
		liczby[0]=4;
		liczby[1]=7;
		liczby[2]=2;
		int min =obj.findMinimalInt(liczby);// wywolanie metody znajdz min. liczbe
		System.out.println("warto�ci� minimaln� jest" + min );
		
	}
}
