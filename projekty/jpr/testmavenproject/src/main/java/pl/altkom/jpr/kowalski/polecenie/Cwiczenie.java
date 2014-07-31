package pl.altkom.jpr.kowalski.polecenie;

/* Polecenie */
public class Cwiczenie implements Polecenie {
	private Zawodnik zawodnik; // obiekt wykonujacy

	public Cwiczenie(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}

	public void wykonaj() {
		zawodnik.zacznijCwiczyc();
	}

	public void cofnij() {
		zawodnik.przestanCwiczyc();
	}

}