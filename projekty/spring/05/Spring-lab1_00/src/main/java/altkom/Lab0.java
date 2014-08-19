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
        Person person1 = context.getBean("person", Person.class);
        Address address1 = context.getBean("address", Address.class);
        //Wyswietl wlsciwosci beanow
        System.out.println(person1);
        System.out.println(address1);
        
        Person person2 = new Person();
        Address address2 = new Address();
        System.out.println(person2);
        System.out.println(address2);
        
    }

}
