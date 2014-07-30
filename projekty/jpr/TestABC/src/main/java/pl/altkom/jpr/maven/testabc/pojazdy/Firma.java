package pl.altkom.jpr.maven.testabc.pojazdy;

import java.util.List;

public class Firma {

	private String nazwa;
	private List<Sprzedawca> sprzedawcy;
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public List<Sprzedawca> getSprzedawcy() {
		return sprzedawcy;
	}
	public void setSprzedawcy(List<Sprzedawca> sprzedawcy) {
		this.sprzedawcy = sprzedawcy;
	}
	
	
}
