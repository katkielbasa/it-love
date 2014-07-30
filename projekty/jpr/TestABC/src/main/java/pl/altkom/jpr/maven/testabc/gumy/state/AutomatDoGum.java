package pl.altkom.jpr.maven.testabc.gumy.state;

public class AutomatDoGum {

	public  int liczbaGum = 10;
	public  int licznikWydanychDo3 = 0;
	
	public  Stan stan;
	
	public AutomatDoGum(){
		stan = new MonetaWlozona(this);
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
