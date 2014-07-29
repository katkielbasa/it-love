package pl.altkom.jpr.nitecki;

import java.util.Random;

public class TableGenerator {

	/**
	 * Klasa TableGenerator ma na celu wygenerowanie tabeli o zadanej w GUI
	 * d�ugo�ci. Na chwil� obecn� nie zosta�o to zaimplementowane wi�c d�ugo��
	 * tabeli zadawana jest domy�lnie w klasie BubbleSortTest.
	 */
	public int[] generateNumbers(int size) {

		int table[] = new int[size];

		Random r = new Random();

		for (int i = 0; i < table.length; i++) {
			table[i] = r.nextInt(1000) + 1;
		}

		return table;
	}

}