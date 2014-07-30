package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public class Diavola implements Pizza{

	@Override
	public String getNazwa() {
		return "Diavola";
	}

	@Override
	public double getCena() {
		 
		return 18d;
	}

	@Override
	public void printParagon() {
		System.out.println("Jestem diavola : "+getCena() );
		
	}

}
