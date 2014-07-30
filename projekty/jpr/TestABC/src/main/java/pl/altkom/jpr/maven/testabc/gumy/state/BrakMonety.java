package pl.altkom.jpr.maven.testabc.gumy.state;

public class BrakMonety implements Stan {
	private AutomatDoGum automatDoGum;
	
	@Override
	public void wkladaneiMonety() {			
		automatDoGum.stan = new MonetaWlozona(automatDoGum);
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
	public BrakMonety(AutomatDoGum automat) {
		this.automatDoGum = automat;
	}

}
