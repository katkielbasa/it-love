package altkom;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.repository.PhoneBookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab3 {
	public static void main( String args[] ) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");

		PhoneBookRepository repository1 = (PhoneBookRepository) factory.getBean("repository1");
		System.out.println("*************** Repository1 ***************");
		for(Entry entry : repository1.findAllEntries()){
		//wszystkie wartosci mapy sa brane i zwracane jako lista
                    	
                    System.out.println(entry.toString());
		}
		
		PhoneBookRepository repository2 = (PhoneBookRepository) factory.getBean("repository2");
		System.out.println("*************** Repository2 ***************");
		for(Entry entry : repository2.findAllEntries()){
			System.out.println(entry.toString());
		}
                
                
		PhoneBookRepository repositoryCar1 = (PhoneBookRepository) factory.getBean("repositoryCar1");
		System.out.println("*************** RepositoryCar1 ***************");
		for(Car car : repositoryCar1.findAllCars()){
		//wszystkie wartosci mapy sa brane i zwracane jako lista
                    	
                    System.out.println(car.toString());
		}
		
		PhoneBookRepository repositoryCar2 = (PhoneBookRepository) factory.getBean("repositoryCar2");
		System.out.println("*************** RepositoryCar2 ***************");
		for(Car car : repositoryCar2.findAllCars()){
			System.out.println(car.toString());
		}
	}
}
