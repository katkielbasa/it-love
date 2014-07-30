package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public class Ser extends Dodatek {

	
	public Ser(Pizza p){
		super(p);
	}
	
	@Override
	public String getNazwa() {
		
		return "Ser";
	}

	@Override
	public double getCena() {
		return pizza.getCena() + 2d;
	}

}
