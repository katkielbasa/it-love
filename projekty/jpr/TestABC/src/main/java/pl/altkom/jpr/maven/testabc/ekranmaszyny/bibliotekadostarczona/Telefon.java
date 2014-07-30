package pl.altkom.jpr.maven.testabc.ekranmaszyny.bibliotekadostarczona;

import pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator.Observator;

public class Telefon {

	private MLibrary accessLibrary = new MLibrary();
	
	 

	 
	public void refresh() {
		System.out.println("Telefon: wyprodukowane w minute: "+accessLibrary.getCountElementProducedInMinute());
		System.out.println("Telefon: wyprodukowane w serii: "+accessLibrary.getCountOfElementInSerie());
		System.out.println("Telefon: Numer stanu: "+accessLibrary.getState());
		
	}
	
	
	
}

