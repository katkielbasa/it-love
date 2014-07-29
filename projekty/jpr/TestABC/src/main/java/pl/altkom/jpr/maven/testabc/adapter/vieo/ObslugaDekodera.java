package pl.altkom.jpr.maven.testabc.adapter.vieo;

import pl.altkom.jpr.maven.testabc.adapter.DivX;
import pl.altkom.jpr.maven.testabc.adapter.Kompressor;

public class ObslugaDekodera {

   private Kompressor kompresor = new DivX();
	
	
   public void wlaczKompresje(){
	   kompresor.komresuj();	   
   }


public Kompressor getKompresor() {
	return kompresor;
}


public void setKompresor(Kompressor kompresor) {
	this.kompresor = kompresor;
}
   
   
}
