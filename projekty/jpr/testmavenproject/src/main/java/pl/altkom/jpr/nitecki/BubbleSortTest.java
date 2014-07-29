package pl.altkom.jpr.nitecki;

/**
 * Klasa BubbleSortTest wywo�uje metody z klas TableGenerator do wygenerowania
 * tabeli int[] zawieraj�cej losowe liczby od 1 do 1001 i drukuje na ekranie
 * wynik sortowania. Nast�pnie wywo�ywana jest metoda z klasy Sorter kt�ra
 * sortuje przy pomocy sortowania b�belkowego zadan� tabel�. Na ko�cu klasa
 * BubbleSortTest drukuje na ekranie wynik sortowania. @author kursant5
 */

public class BubbleSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableGenerator table = new TableGenerator();
		Sorter tabsorted = new Sorter();
		MinimalValueSearcher min = new MinimalValueSearcher();
		int tab[] = table.generateNumbers(100); // tu w�a�nie zadawana jest
												// "na twardo" ilo�� liczb do
												// wygenerowania. W przysz�o�ci
												// zaimplementowane zostanie
												// pobieranie tej warto�ci od
												// u�ytkownika.

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}

		System.out.println("=====================================");

		tabsorted.bubbleSort(tab);

		for (int i = 0; i < tab.length; i++) {
			System.out.println(tab[i]);
		}
		System.out.println("=====================================");
		System.out.println("Najmniejsza liczba to: " + min.findMinimalInt(tab));

	}

}
