package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

import pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator.Observator;

public class Telefon implements Observator {

	private MLibrary accessLibrary = new MLibrary();
	
	 

	@Override
	public void update() {
		System.out.println("Telefon: wyprodukowane w minute: "+accessLibrary.getCountElementProducedInMinute());
		System.out.println("Telefon: wyprodukowane w serii: "+accessLibrary.getCountOfElementInSerie());
		System.out.println("Telefon: Numer stanu: "+accessLibrary.getState());
		
	}
	
	
	
}

