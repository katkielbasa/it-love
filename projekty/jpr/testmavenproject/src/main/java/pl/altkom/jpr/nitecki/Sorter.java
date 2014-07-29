package pl.altkom.jpr.nitecki;

import java.util.Arrays;

public class Sorter {

	/** Klasa ta ma na celu sortowanie zawarto�ci tabeli. */

	public void bubbleSort(int[] tab) {
		if (tab == null){
			return;
		}
		Arrays.sort(tab);

		/*
		 * Sprawa oczywista dlaczego zosta�o to zakomentowane. Tabel� sortowa�
		 * b�dzie teraz Arrays.sort(tab);
		 */

		// int j;
		// boolean flag = true; // set flag to true to begin first pass
		// int temp; // holding variable
		//
		// while (flag) {
		// flag = false; // set flag to false awaiting a possible swap
		// for (j = 0; j < tab.length - 1; j++) {
		// if (tab[j] < tab[j + 1]) // change to > for ascending sort
		// {
		// temp = tab[j]; // swap elements
		// tab[j] = tab[j + 1];
		// tab[j + 1] = temp;
		// flag = true; // shows a swap occurred
		// }
		// }
		// }

	}

}
