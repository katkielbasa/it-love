package pl.altkom.jpr.instruktor;

import java.util.Arrays;

 

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String args[]){
		
		MinimalValueSearcher obj = new MinimalValueSearcher();
		int[] liczby = new int[3];
		liczby[0]=500;
		liczby[1]=1200;
		liczby[2]=54;
		int wynik = obj.findMinimalInt(liczby);
		System.out.println(wynik);
		
		Arrays.sort(liczby);
		
//		ValueSorter sorter = new ValueSorter();
//		liczby = sorter.sort(liczby);
		for (int i : liczby) {
			System.out.println("Liczba = "+i);
		}
		
		
//		
//		
//		for (int i = 0; i < 100; i++){
//			System.out.println("Będę uważał na zajęciach, jak instruktor tumaczy pętle "+i);
//		}
//		
//		for (int liczba : liczby) {
//			
//		}
		
//		PostTaxCalculator pc = new PostTaxCalculator();
//		System.out.println(pc.calculateExpressPayment(1, wynik, false));
		
	}
}
