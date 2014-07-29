package pl.altkom.jpr.instruktor;

/**
 * Klasa jest odpowiedzialna 
 * za sortowanie różnych wartości
 * @author instruktor
 *
 */
public class ValueSorter {
	
	/**
	 * sortowanie za pomocą algorytmu bąbelkowego
	 * @param liczby
	 * @return
	 */
	public int[] sort(int[] liczby){
		
		boolean czyZamiana = true;
		while(czyZamiana){
			czyZamiana =false;
			for(int i = 0; i < (liczby.length-1); i++ ){
				
				int lewy = liczby[i];
				int prawy = liczby[i+1];
				if(lewy > prawy){
					czyZamiana = true;
					liczby[i] = prawy;
					liczby[i+1] = lewy;
				}
				
			}
		}
		
		return liczby;
	}

}
