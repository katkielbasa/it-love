package pl.altkom.jpr.kowalski.polecenie;

/* Polecenie */
public class Plywanie implements Polecenie {
	private Zawodnik zawodnik; // obiekt wykonujacy

	public Plywanie(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}

	public void wykonaj() {
		zawodnik.zacznijPlywac();
	}

	public void cofnij() {
		zawodnik.przestanPlywac();
	}
}
