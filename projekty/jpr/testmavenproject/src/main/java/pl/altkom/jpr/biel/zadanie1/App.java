package pl.altkom.jpr.biel.zadanie1;

public class App {

 public static void main(String args[]) {
	MinimalValue obj = new MinimalValue(); //obiekt minimalvalue w zmiennej obj
	//int[] liczby = { 4, 3, 6, 7 }; //przygotowanie tablicy "liczby" (deklaracja typu) i wartosci
	int[] liczby = new int[3];
	liczby[0]=4;
	liczby[1]=7;
	liczby[2]=2;
	
	int min = obj.findMinimalInt(liczby);
	System.out.println(min);
}
}
