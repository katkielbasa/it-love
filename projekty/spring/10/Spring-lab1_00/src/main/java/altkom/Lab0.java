package altkom;

import altkom.model.Address;
import altkom.model.Car;
import altkom.model.Dom;
import altkom.model.Komputer;
import altkom.model.Mieszkanie;
import altkom.model.Okno;
import altkom.model.Person;
import altkom.model.Pokoj;
import altkom.model.Sciana;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Lab0 {

    public static void main(String args[]) {

        //Utworz kontener
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

            //BeanFactory context = new XmlBeanFactory(new ClassPathResource("context.xml"));
		//Pobierz beany z kontenera
        Person person1 = context.getBean("person", Person.class);
        Address address1 = context.getBean("address", Address.class);
        Car car1 = context.getBean("car", Car.class);
        Dom dom1 = (Dom) context.getBean("dom");
        Komputer komputer1 = (Komputer) context.getBean("komputer");
        Pokoj pokoj1 = context.getBean("pokoj", Pokoj.class);
        Mieszkanie mieszkanie1 = context.getBean("mieszkanie", Mieszkanie.class);
        Sciana sciana = context.getBean("sciana", Sciana.class);
        Okno okno = (Okno) context.getBean("okno");

        //Wyswietl wlsciwosci beanow
        System.out.println(person1);
        System.out.println(address1);
        System.out.println(car1);
        System.out.println(dom1);
        System.out.println(komputer1);
        System.out.println(mieszkanie1);
        System.out.println(pokoj1);
        System.out.println(sciana);
        System.out.println(okno);
    }

}
