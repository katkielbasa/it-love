package pl.altkom.jpr.maven.testabc.ekranmaszyny.bibliotekadostarczona;

public class Ekran {

	private MLibrary accessLibrary = new MLibrary();
	
	public void refresh(){
		System.out.println("wyprodukowane w minute: "+accessLibrary.getCountElementProducedInMinute());
		System.out.println("wyprodukowane w serii: "+accessLibrary.getCountOfElementInSerie());
		System.out.println("Numer stanu: "+accessLibrary.getState());
	}
	
	
	public static void main(String args[]){
		Ekran ekran = new Ekran();
		MachineListener listener = new MachineListener(ekran);
		listener.start();
		
	}
}

