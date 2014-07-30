package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public class Salami extends Dodatek {

	
	public Salami(Pizza p){
		super(p);
	}
	
	@Override
	public String getNazwa() {
		
		return "Salami";
	}

	@Override
	public double getCena() {
		return pizza.getCena() + 2d;
	}

}
