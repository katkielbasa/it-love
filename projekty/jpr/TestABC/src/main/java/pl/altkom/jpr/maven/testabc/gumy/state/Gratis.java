package pl.altkom.jpr.maven.testabc.gumy.state;

public class Gratis implements Stan {

	private AutomatDoGum automatDoGum;

	@Override
	public void wkladaneiMonety() {			
		System.out.println("masz gratisa, możesz odebrać, przekręc tylko gałką");	
	}

	@Override
	public void przekrecenieGalka() {
		automatDoGum.stan = new WydawanieGumy(automatDoGum);
		System.out.println("Oto twoj gratis");
		automatDoGum.liczbaGum--;
	}

	@Override
	public void odbieranieGumy() {
		System.out.println("masz gratisa, możesz odebrać, przekręc tylko gałką");
		
	}

	public Gratis(AutomatDoGum automat) {
		this.automatDoGum = automat;
	}
	
}
