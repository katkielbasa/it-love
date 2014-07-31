package pl.altkom.jpr.kowalski.polecenie;

class Bieganie implements Polecenie {
	private Zawodnik zawodnik; // obiekt wykonujacy

	public Bieganie(Zawodnik zawodnik) {
		this.zawodnik = zawodnik;
	}

	public void wykonaj() {
		zawodnik.zacznijBiegac();
	}

	public void cofnij() {
		zawodnik.przestanBiegac();
	}
}
