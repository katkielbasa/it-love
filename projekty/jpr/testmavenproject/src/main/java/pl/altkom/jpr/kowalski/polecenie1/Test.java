package pl.altkom.jpr.kowalski.polecenie1;

public class Test {

	public static void main(String[] args) {
		Trener trener = new Trener();
		Zawodnik z1 = new Zawodnik("Kowalski");
		Zawodnik z2 = new Zawodnik("Nowak");
		Zawodnik z3 = new Zawodnik("Brzeczyszczykiewicz");

		Bieganie bieganie = new Bieganie(z1);
		Plywanie plywanie = new Plywanie(z2);

		trener.setMode(bieganie);
		trener.rozkaz();
		trener.setMode(plywanie);
		trener.rozkaz();
		trener.cofnij();

		System.out.println();

		Polecenie[] tab = { new Cwiczenie(z3), new Bieganie(z3),
				new Plywanie(z3) };
		PelnyTrening pelnyTrening = new PelnyTrening(tab);
		trener.setMode(pelnyTrening);
		trener.rozkaz();

	}

}