package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public abstract class Dodatek implements Pizza {

	
	protected Pizza pizza;
	
	public Dodatek(Pizza p){
		pizza = p;
	}
	
	@Override
	public void printParagon() {
		pizza.printParagon();
		System.out.println(getNazwa() +" : "+(getCena()-pizza.getCena()) );	
	}
}
