package pl.altkom.jpr.maven.testabc.gumy.statenastaticach;

public class WydawanieGumy implements Stan{

	
	@Override
	public void wkladaneiMonety() {
		System.out.println("weź gumę najpierw");
		
	}

	@Override
	public void przekrecenieGalka() {
		System.out.println("weź gumę najpierw a potem umieść monete");
		
	}

	@Override
	public void odbieranieGumy() {
		System.out.println("smacznego");
		if(AutomatDoGum.liczbaGum >0){
			if (AutomatDoGum.licznikWydanychDo3 >=2){
				AutomatDoGum.licznikWydanychDo3= 0;
				AutomatDoGum.stan = new Gratis();
			}else{
				AutomatDoGum.stan = new BrakMonety();
			}
		}else{
			AutomatDoGum.stan = new BrakGum();
		}
		
		
	}
	
	

}
