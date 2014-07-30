package pl.altkom.jpr.maven.testabc.pojazdy;


public class Pojazd {

	private String nrRejstracyjny;
	private Klient wlasciciel;
	public String getNrRejstracyjny() {
		return nrRejstracyjny;
	}
	public void setNrRejstracyjny(String nrRejstracyjny) {
		this.nrRejstracyjny = nrRejstracyjny;
	}
	public Klient getWlasciciel() {
		return wlasciciel;
	}
	public void setWlasciciel(Klient wlasciciel) {
		this.wlasciciel = wlasciciel;
	}
	
	
}
