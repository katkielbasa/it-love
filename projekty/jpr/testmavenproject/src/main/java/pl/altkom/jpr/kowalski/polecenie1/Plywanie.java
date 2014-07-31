package pl.altkom.jpr.kowalski.polecenie1;

/* Polecenie */
public class Plywanie implements Polecenie {
	private Zawodnik zawodnik; // obiekt wykonujacy

	public Plywanie(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}

	public void wykonaj() {
		zawodnik.zacznijPlywac();
		HistoriaPolecen.historia.add((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
	}

	public void cofnij() {
		zawodnik.przestanPlywac();
		HistoriaPolecen.historia.remove((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
	}
}
