package pl.altkom.jpr.maven.testabc.gumy.statenastaticach;

public class MonetaWlozona implements Stan{


	
	@Override
	public void wkladaneiMonety() {
		System.out.println("ej, już masz monete!");
		
	}

	@Override
	public void przekrecenieGalka() {
		AutomatDoGum.stan = new WydawanieGumy();
		System.out.println("ok, wydaje!");
		AutomatDoGum.liczbaGum--;
		AutomatDoGum.licznikWydanychDo3++;
		
	}

	@Override
	public void odbieranieGumy() {
		System.out.println("najpierw przekręc gałką!");
		
	}
	

}
