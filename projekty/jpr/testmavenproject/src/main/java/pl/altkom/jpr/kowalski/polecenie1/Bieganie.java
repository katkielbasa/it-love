package pl.altkom.jpr.kowalski.polecenie1;

import pl.altkom.jpr.kowalski.polecenie1.HistoriaPolecen;


public class Bieganie implements Polecenie {
	private Zawodnik zawodnik;

	public Bieganie(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}

	public void wykonaj() {
		zawodnik.zacznijBiegac();
		HistoriaPolecen.historia.add((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
	}

	public void cofnij() {
		zawodnik.przestanBiegac();
		HistoriaPolecen.historia.remove((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
	}
}
