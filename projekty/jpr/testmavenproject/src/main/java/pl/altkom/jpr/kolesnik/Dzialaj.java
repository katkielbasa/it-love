package pl.altkom.jpr.kolesnik;

public class Dzialaj {

	public static void main(String args[]) {

		Minimum obj = new Minimum();
		int[] liczby = { 4, 3, 6, 7 };

		int min = obj.findMinimalInt(liczby);
		System.out.println(min);
	}

}
