package altkom;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.Komputer;
import altkom.model.repository.PhoneBookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3 {
	public static void main( String args[] ) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");

		PhoneBookRepository repository1 = (PhoneBookRepository) factory.getBean("repository1");
		System.out.println("*************** Repository1 ***************");
		for(Entry entry : repository1.findAllEntries()){
			System.out.println(entry.toString());
		}
		
		PhoneBookRepository repository2 = (PhoneBookRepository) factory.getBean("repository2");
		System.out.println("*************** Repository2 ***************");
		for(Entry entry : repository2.findAllEntries()){
			System.out.println(entry.toString());
		}
                PhoneBookRepository repository3 = (PhoneBookRepository) factory.getBean("repository3");
		System.out.println("*************** Repository3 ***************");
		for(Car cars : repository3.findAllCars()){
			System.out.println(cars.toString());
        
                }
                PhoneBookRepository repository4 = (PhoneBookRepository) factory.getBean("repository4");
		System.out.println("*************** Repository4 ***************");
		for(Car cars : repository4.findAllCars()){
			System.out.println(cars.toString());
                }
                
                PhoneBookRepository repository5 = (PhoneBookRepository) factory.getBean("repository5");
		System.out.println("*************** Repository5 ***************");
		for(Komputer comps : repository5.findAllComps()){
			System.out.println(comps.toString());
        
                }
                PhoneBookRepository repository6 = (PhoneBookRepository) factory.getBean("repository6");
		System.out.println("*************** Repository6 ***************");
		for(Komputer comps : repository6.findAllComps()){
			System.out.println(comps.toString());
                }
	}
        
}
