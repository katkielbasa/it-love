package pl.altkom.jpr.maven.testabc.gumy.statenastaticach;

public class BrakMonety implements Stan {
	
	
	@Override
	public void wkladaneiMonety() {			
		AutomatDoGum.stan = new MonetaWlozona();
		System.out.println("dzięki");
	}

	@Override
	public void przekrecenieGalka() {
		System.out.println("umieśc monete");	
	}

	@Override
	public void odbieranieGumy() {
		System.out.println("umieśc monete i przekręć gałką");
		
	}
	
}
