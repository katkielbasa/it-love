package pl.altkom.jpr.maven.testabc.gumy.statenastaticach;

public class Test {

	public static void main(String[] args) {
		AutomatDoGum a = new AutomatDoGum();
		
		a.wkladaneiMonety();
		a.przekrecenieGalka();
		a.odbieranieGumy();
		
		a.wkladaneiMonety();
		a.przekrecenieGalka();
		a.odbieranieGumy();
		
		a.wkladaneiMonety();
		a.przekrecenieGalka();
		a.odbieranieGumy();
	
		a.wkladaneiMonety();
		a.przekrecenieGalka();
		a.odbieranieGumy();

		a.wkladaneiMonety();
		a.przekrecenieGalka();
		a.odbieranieGumy();
		
		AutomatDoGum a2 = new AutomatDoGum();
		System.out.println(a2.liczbaGum);
		
	}

}
