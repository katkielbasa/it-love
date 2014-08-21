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
        BeanFactory context = new XmlBeanFactory(new ClassPathResource("context.xml"));

        ApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");

//Pobierz beany z kontenera
        Person person1 = context.getBean("person", Person.class);
        Address address1 = context.getBean("address", Address.class);
        Car car = context.getBean("car", Car.class);
        Dom dom = context.getBean("dom", Dom.class);
        Komputer komputer = context.getBean("komputer", Komputer.class);
        Mieszkanie mieszkanie = (Mieszkanie) context.getBean("mieszkanie");
        Pokoj pokoj = mieszkanie.getPokoj();

        Okno okno = (Okno) factory.getBean("okno");
        Szyba szyba = okno.getSzyba();
        
        Sciana sciana = factory.getBean("sciana", Sciana.class);
        Tablica tablica = factory.getBean("tablica", Tablica.class);
//Klucz jest taki sam jak nazwa klasy ale pisany malymi literami		

//Wyswietl wlsciwosci beanow na konsoli
        System.out.println(person1);
        System.out.println(address1);
        System.out.println(car);
        System.out.println(dom);
        System.out.println(komputer);
        System.out.println(mieszkanie.toString());
        System.out.println(pokoj.toString());
        System.out.println(mieszkanie.getPokoj().getKolor());
        System.out.println(okno);
        System.out.println(okno.toString());
        System.out.println(szyba.toString());
        System.out.println("W oknie jest szyba o wadze: " + okno.getSzyba().getWaga()+ "kg");
        System.out.println("Na scianie jest tablica w kolorze: " + sciana.getTablica().getKolor());
        System.out.println("Na scianie jest tablica w kolorze: " + tablica.getKolor());
    }

}
