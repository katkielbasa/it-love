package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public class Margerita implements Pizza{

	@Override
	public String getNazwa() {
		return "margerita";
	}

	@Override
	public double getCena() {
		return 14d;
	}
	
	public void printParagon() {
		System.out.println("Jestem margerita : "+getCena() );
		
	}

}
