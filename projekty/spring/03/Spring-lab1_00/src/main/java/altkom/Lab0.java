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
import altkom.model.Szyba;
import altkom.model.Tablica;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Lab0 {
	public static void main(String args[]) {

		//Utworz kontener
            ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
            
		//Pobierz beany z kontenera
            Person person1 = context.getBean("person", Person.class);//"person"  to id contect.xml
            Address address1 = context.getBean("address", Address.class);
            Car car1 = context.getBean("car", Car.class);
            Dom dom1 = context.getBean("dom", Dom.class);
            Komputer komputer1= context.getBean("komputer", Komputer.class);
            Pokoj pokoj1 = context.getBean("pokoj", Pokoj.class);
            Mieszkanie mieszkanie1 = context.getBean("mieszkanie", Mieszkanie.class);
            Szyba szyba1 = context.getBean("szyba", Szyba.class);
            Okno okno1 = context.getBean("okno", Okno.class);
            Tablica tablica1 = context.getBean("tablica", Tablica.class);
            Sciana sciana1 = context.getBean("sciana", Sciana.class);
            
		//Wyswietl wlsciwosci beanow
		System.out.println(person1);
                System.out.println(address1);//wyœwietla sie klasa person i adress - klasa !!!
                System.out.println(car1);
                 System.out.println(dom1);
                 System.out.println(komputer1);
                 System.out.println(pokoj1);
                 System.out.println(mieszkanie1);
                 //String kolor = mieszkanie1.getPokoj().getKolor();
                 //System.out.println(kolor);
                 System.out.println(szyba1);
                 System.out.println(okno1);
                 System.out.println(tablica1);
                 System.out.println(sciana1);
               
	} 
	
}
