package altkom;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import altkom.model.Address;
import altkom.model.Person;


public class Lab0 {
    
	public static void main(String args[]) {

		//Utworz kontener
		BeanFactory context = new XmlBeanFactory(new ClassPathResource("context.xml"));
		//Pobierz beany z kontenera
		Person person = (Person) context.getBean("person");
		Address address = (Address) context.getBean("address");
		//Wyswietl wlsciwosci beanow
		System.out.println(person.toString());
		System.out.println(address.toString());
		
	} 
	
}
