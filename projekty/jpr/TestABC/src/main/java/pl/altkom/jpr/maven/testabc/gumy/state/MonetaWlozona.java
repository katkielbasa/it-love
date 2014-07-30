package pl.altkom.jpr.maven.testabc.gumy.state;

public class MonetaWlozona implements Stan{

	private AutomatDoGum automatDoGum;
	
	@Override
	public void wkladaneiMonety() {
		System.out.println("ej, już masz monete!");
		
	}

	@Override
	public void przekrecenieGalka() {
		automatDoGum.stan = new WydawanieGumy(automatDoGum);
		System.out.println("ok, wydaje!");
		automatDoGum.liczbaGum--;
		automatDoGum.licznikWydanychDo3++;
		
	}

	@Override
	public void odbieranieGumy() {
		System.out.println("najpierw przekręc gałką!");
		
	}
	
	public MonetaWlozona(AutomatDoGum automat) {
		this.automatDoGum = automat;
	}

}
