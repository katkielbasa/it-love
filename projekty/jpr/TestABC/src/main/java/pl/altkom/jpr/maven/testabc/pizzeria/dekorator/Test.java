package pl.altkom.jpr.maven.testabc.pizzeria.dekorator;

public class Test {

	public static void main(String[] args) {
	
		Pizza p = new Salami(new Ser(new Kukurydza(new Ser(new Ser(new Margerita())))));
		p.printParagon();
		System.out.println(p.getCena());
		

	}

}
