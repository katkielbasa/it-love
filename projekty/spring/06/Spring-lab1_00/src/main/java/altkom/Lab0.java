package altkom;

import altkom.model.Address;
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
		//Wyswietl wlsciwosci beanow
            System.out.println(person1);
            System.out.println(address1);
		
	} 
	
}
