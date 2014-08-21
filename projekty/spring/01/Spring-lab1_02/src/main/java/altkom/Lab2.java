package altkom;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import altkom.model.Address;
import altkom.model.Entry;
import altkom.model.Person;
import altkom.model.Phone;

public class Lab2 {
	public static void main( String args[] ) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("context.xml");

		Entry entry = (Entry) factory.getBean("entry");
		System.out.println(entry.toString());

		Person person = entry.getPerson();
		System.out.println(person.toString());

		Address address = entry.getAddress();
		System.out.println(address.toString());

		Phone phone = entry.getPhone();
		System.out.println(phone.toString());
	}
}
