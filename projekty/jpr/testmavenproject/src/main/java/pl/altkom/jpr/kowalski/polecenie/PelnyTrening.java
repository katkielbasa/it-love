package pl.altkom.jpr.kowalski.polecenie;

/* Polecenie */
public class PelnyTrening implements Polecenie {
	Polecenie[] tab;

	public PelnyTrening(Polecenie[] tab) {
		this.tab = tab;
	}

	public void wykonaj() {
		for (Polecenie temp : tab) {
			temp.wykonaj();
		}
	}

	public void cofnij() {
		for (Polecenie temp : tab) {
			temp.cofnij();
		}
	}
  }

