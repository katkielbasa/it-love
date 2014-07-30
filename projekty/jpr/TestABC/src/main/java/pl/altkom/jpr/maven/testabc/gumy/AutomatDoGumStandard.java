package pl.altkom.jpr.maven.testabc.gumy;

public class AutomatDoGumStandard {

	int liczbaGum = 10;
	/**
	 * 0 - brak monety
	 * 1 - moneta włożona
	 * 2 - wydawanie gumy
	 * 3 - brak gum
	 */
	int stan = 0;
	
	
	public void wkladaneiMonety(){
		if(stan == 0){
			stan = 1;
			System.out.println("oo, dzięki");			
		}else if(stan == 1){
			System.out.println("masz już monete");
		}else if(stan == 2){
			System.out.println("odbierz gume");
		}else if(stan == 3){
			System.out.println("brak gum");
		}		
	}
	
	public void przekrecenieGalka(){
		if(stan == 0){
			System.out.println("brak monety!!!");			
		}else if(stan == 1){
			System.out.println("super, czekaj na gume");
			liczbaGum--;
			stan = 2;
		}else if(stan == 2){
			System.out.println("odbierz gume");
		}else if(stan == 3){
			System.out.println("brak gum");
		}		
	}
	public void odbieranieGumy(){
		if(stan == 0){
			System.out.println("brak monety!!!");			
		}else if(stan == 1){
			System.out.println("przkręc gałką");			
		}else if(stan == 2){
			System.out.println("fajnie, ze zabaęłś, smacznego");
			if(liczbaGum>0){
				stan =0;
			}else{
				stan= 3;
			}
		}else if(stan == 3){
			System.out.println("brak gum");
		}		
	}
}
