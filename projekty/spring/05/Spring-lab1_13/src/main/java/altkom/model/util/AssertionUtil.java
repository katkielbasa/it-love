package altkom.model.util;

import altkom.model.Car;
import altkom.model.Entry;
import altkom.model.Person;

public class AssertionUtil {

    public static void assertTrue(boolean condition, String failMessage) {

        if (condition == false) {
            throw new PhoneBookApplicationException(failMessage);
        }
    }

    public static void assertPerson(Entry entry) {
        final Person person = entry.getPerson();
        final Car car = entry.getCar();

        assertTrue(person.getName() != null, "Entry.person.name cannot be null");
        assertTrue(person.getSurname() != null, "Entry.person.surname cannot be null");
        assertTrue(car.getKolor()!= null, "Entry.car.marka cannot be null");
        assertTrue(car.getMarka() != null, "Entry.car.kolor cannot be null");
    }

}
