package pl.altkom.jpr.maven.testabc.gumy.state;

public class WydawanieGumy implements Stan{

	private AutomatDoGum automatDoGum;
	
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
		if(automatDoGum.liczbaGum >0){
			if (automatDoGum.licznikWydanychDo3 >=2){
				automatDoGum.licznikWydanychDo3= 0;
				automatDoGum.stan = new Gratis(automatDoGum);
			}else{
				automatDoGum.stan = new BrakMonety(automatDoGum);
			}
		}else{
			automatDoGum.stan = new BrakGum(automatDoGum);
		}
		
		
	}
	
	public WydawanieGumy(AutomatDoGum automat) {
		this.automatDoGum = automat;
	}

}
