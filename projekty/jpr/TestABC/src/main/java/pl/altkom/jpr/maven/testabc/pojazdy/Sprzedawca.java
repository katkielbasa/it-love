package pl.altkom.jpr.maven.testabc.pojazdy;

import java.util.List;

public class Sprzedawca {

	private String imie;
	private String nazwisko;
	private List<Pojazd> historiaSprzedazy;
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public List<Pojazd> getHistoriaSprzedazy() {
		return historiaSprzedazy;
	}
	public void setHistoriaSprzedazy(List<Pojazd> historiaSprzedazy) {
		this.historiaSprzedazy = historiaSprzedazy;
	}
	
	
	
}
