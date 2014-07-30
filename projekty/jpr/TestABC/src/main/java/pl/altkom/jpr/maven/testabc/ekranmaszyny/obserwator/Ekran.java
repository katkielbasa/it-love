package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

public class Ekran implements Observator {

	private MLibrary accessLibrary = new MLibrary();
	
	public void refresh(){
		System.out.println("wyprodukowane w minute: "+accessLibrary.getCountElementProducedInMinute());
		System.out.println("wyprodukowane w serii: "+accessLibrary.getCountOfElementInSerie());
		System.out.println("Numer stanu: "+accessLibrary.getState());
	}
	
	


	@Override
	public void update() {
		refresh();		
	}
}

