package pl.altkom.jpr.maven.testabc.gumy.statenastaticach;

public class AutomatDoGum {

	public static int liczbaGum = 10;
	public static int licznikWydanychDo3 = 0;
	
	public static Stan stan;
	
	public AutomatDoGum(){
		stan = new BrakMonety();
	}

	public void wkladaneiMonety() {
		stan.wkladaneiMonety();
	}

	public void przekrecenieGalka() {
		stan.przekrecenieGalka();
	}

	public void odbieranieGumy() {
		stan.odbieranieGumy();
	}
}
