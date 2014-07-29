package pl.altkom.jpr.instruktor;

 

public class TestPrzekazywaniaParametrow {

	public static void main(String args[]){
		TestPrzekazywaniaParametrow t = new TestPrzekazywaniaParametrow();
		int x = 10;
		int y = x;
		System.out.println(x );
		System.out.println(y );
		System.out.println("----");
		x = 14;
		System.out.println(x );
		System.out.println(y );
		
		
		Car c = new Car();
		c.setNumber("SWD9W65");
		
		Car c2 = c;
		System.out.println(c.getNumber() );
		System.out.println(c2.getNumber() );
		System.out.println("----");
		c.setNumber("AAAA");
		System.out.println(c.getNumber() );
		System.out.println(c2.getNumber() );
		
		
		String p = new String("Pies");
		String p1 = p;
		
		String nes = p.toUpperCase();
		System.out.println(p);
		System.out.println(p1 );
		System.out.println(nes);
		
		
		Car c4 = new Car();
		c4.setNumber("ASDASD");
		
		c4 = new Car();
		System.out.println(c4.getNumber());
		
		
		
		Date d = new Date();
		d.day=24;
		d.month=12;
		d.year=2014;
		
		System.out.println(d);

		t.changeVal(d);
		
		System.out.println(d);
		
	}
	
	
	
	public void changeVal(Date d) { 
			d = new Date();
			d.year=100;
			d.month=12;
			d.day=12;
			System.out.println(d);
		}
}
