package pl.altkom.jpr.kowalski.polecenie1;

/* Polecenie */
public class PelnyTrening implements Polecenie {
	Polecenie[] tab;

	public PelnyTrening(Polecenie[] tab) {
		this.tab = tab;
	}

	public void wykonaj() {
		for (Polecenie temp : tab) {
			temp.wykonaj();
			HistoriaPolecen.historia.add((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
		}
	}

	public void cofnij() {
		for (Polecenie temp : tab) {
			temp.cofnij();
			HistoriaPolecen.historia.remove((pl.altkom.jpr.kowalski.polecenie1.Polecenie) this);
		}
	}
  }

