package pl.altkom.jpr.kowalski.polecenie1;

/* Polecenie */
public class Cwiczenie implements Polecenie {
	private Zawodnik zawodnik; // obiekt wykonujacy

	public Cwiczenie(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}

	public void wykonaj() {
		zawodnik.zacznijCwiczyc();
		HistoriaPolecen.historia.add((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
	}

	public void cofnij() {
		zawodnik.przestanCwiczyc();
		HistoriaPolecen.historia.remove((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
	}

}