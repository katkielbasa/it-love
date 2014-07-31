package pl.altkom.jpr.maven.testabc.pojazdy;

public class Test {

	public static void main(String[] args) {
		Address a = new Address();
		a.setUlica("Mickiewicza");
		a.setMiast("Warszawa");
		
		Address a1 = new Address();
		a1.setUlica("Marszalkowska");
		a1.setMiast("Wrocław");

		
		System.out.println(a1.getMiast());
	}

}
