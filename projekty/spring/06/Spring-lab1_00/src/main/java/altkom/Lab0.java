package altkom;

import altkom.model.Address;
import altkom.model.Car;
import altkom.model.Dom;
import altkom.model.Komputer;
import altkom.model.Mieszkanie;
import altkom.model.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


public class Lab0 {
	public static void main(String args[]) {

		//Utworz kontener
            BeanFactory context = new XmlBeanFactory(new ClassPathResource("context.xml"));

		//Pobierz beany z kontenera
            Person person1 = context.getBean("person",Person.class);
            //jeœli bean tworzony przez adnotacjê, to Spring jako identyfikator bierze nazwê klasy
            //i piszê z ma³ej 
            Address address1 = context.getBean("address", Address.class);
            Car car1 = context.getBean("car",Car.class);
            Car car2 = context.getBean("cark",Car.class);
            Dom dom1 = context.getBean("dom",Dom.class);
            Dom dom2 = context.getBean("domek",Dom.class);
            Komputer komputer = context.getBean("komputer",Komputer.class);
            Mieszkanie mieszkanie = context.getBean("mieszkanie",Mieszkanie.class);
		//Wyswietl wlsciwosci beanow
            System.out.println(person1);
            System.out.println(address1);
            System.out.println(car1);
            System.out.println(car2);
            System.out.println(dom1);
            System.out.println(dom2);
            System.out.println(komputer);
            System.out.println(mieszkanie);
		
	} 
	
}
