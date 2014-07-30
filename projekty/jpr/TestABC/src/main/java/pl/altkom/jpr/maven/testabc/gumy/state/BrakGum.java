package pl.altkom.jpr.maven.testabc.gumy.state;

public class BrakGum implements Stan {

	private AutomatDoGum automatDoGum;

	@Override
	public void wkladaneiMonety() {
		System.out.println("brak gum");

	}

	@Override
	public void przekrecenieGalka() {
		System.out.println("brak gum");

	}

	@Override
	public void odbieranieGumy() {
		System.out.println("brak gum");

	}

	public BrakGum(AutomatDoGum automat) {
		this.automatDoGum = automat;
	}

}
