package pl.altkom.jpr.maven.testabc.gumy.statenastaticach;

public class Gratis implements Stan {



	@Override
	public void wkladaneiMonety() {			
		System.out.println("masz gratisa, możesz odebrać, przekręc tylko gałką");	
	}

	@Override
	public void przekrecenieGalka() {
		AutomatDoGum.stan = new WydawanieGumy();
		System.out.println("Oto twoj gratis");
		AutomatDoGum.liczbaGum--;
	}

	@Override
	public void odbieranieGumy() {
		System.out.println("masz gratisa, możesz odebrać, przekręc tylko gałką");
		
	}

	 
	
}
