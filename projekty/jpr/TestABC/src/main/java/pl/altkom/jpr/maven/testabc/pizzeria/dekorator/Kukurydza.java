package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public class Kukurydza extends Dodatek {

	
	public Kukurydza(Pizza p){
		super(p);
	}
	
	@Override
	public String getNazwa() {
		
		return "Kukurydza";
	}

	@Override
	public double getCena() {
		return pizza.getCena() + 2d;
	}

}
