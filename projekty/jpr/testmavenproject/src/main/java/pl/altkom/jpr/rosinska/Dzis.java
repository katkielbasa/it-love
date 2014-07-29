package pl.altkom.jpr.rosinska;

public class Dzis {
	
	/* Klasa w której utworzone są dwie metody: poczta i internet.
	 * Zadeklarowane są tu i zaincjalizowane zmienne używane w tych klasach.
	 * Wartości zmiennych są przepisane z tabelki, która wczoraj była wyświetlana na rzutniku.
	 */


	double poczta1 = 36.00;
	double poczta2 = 38.00;
	double poczta3 = 39.00;
	double poczta4 = 43.00;
	double poczta5 = 65.00;
	double poczta6 = 125.00;

	public double poczta(double wartosc) {
		if (wartosc >= 0.01 && wartosc <= 200) {
			System.out.println(poczta1);
			return poczta1;
		} else if (wartosc >= 200.01 && wartosc <= 300.00) {
			System.out.println(poczta2);
			return poczta2;
		} else if (wartosc >= 300.01 && wartosc <= 500.00) {
			System.out.println(poczta3);
			return poczta3;
		} else if (wartosc >= 500.01 && wartosc <= 1000.00) {
			System.out.println(poczta4);
			return poczta4;
		} else if (wartosc >= 1000.01 && wartosc <= 5000.00) {
			System.out.println(poczta5);
			return poczta5;
		} else if (wartosc >= 5000.01) {
			System.out.println(poczta6);
			return poczta6;
		} else {
			System.out.println("Klient nic nie wysy�a poczt�");
			return 0;
		}
	}
	
	
	
	
	double internet1 = 34.00;
	double internet2 = 36.00;
	double internet3 = 37.00;
	double internet4 = 41.00;
	double internet5 = 63.00;
	double internet6 = 123.00;

	public double internet(double wartosc) {
		if (wartosc >= 0.01 && wartosc <= 200) {
			System.out.println(internet1);
			return internet1;
		} else if (wartosc >= 200.01 && wartosc <= 300.00) {
			System.out.println(internet2);
			return internet2;
		} else if (wartosc >= 300.01 && wartosc <= 500.00) {
			System.out.println(internet3);
			return internet3;
		} else if (wartosc >= 500.01 && wartosc <= 1000.00) {
			System.out.println(internet4);
			return internet4;
		} else if (wartosc >= 1000.01 && wartosc <= 5000.00) {
			System.out.println(internet5);
			return internet5;
		} else if (wartosc >= 5000.01) {
			System.out.println(internet6);
			return internet6;
		}
		else {
			System.out.println("Klient nic nie wysy�a przez internet");
			return 0;
		}
	}
}
