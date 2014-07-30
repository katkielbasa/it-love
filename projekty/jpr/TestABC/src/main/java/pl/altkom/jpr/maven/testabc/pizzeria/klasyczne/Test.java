package pl.altkom.jpr.maven.testabc.pizzeria.klasyczne;

/**
 * Przygotuj diagram klas dla systemu obsługi
 * obliczania cen pizzy w pizzerii. Pizzeria 
 * przygotowuje następujące rodzaje pizzy:
 * margerita, peperoni, farmerska, diavola.
 * Do każdej z nich można zamówić dodatek 
 * (kiełbasa peperoni, kurczak, dodatkowy
 * ser oraz kukurydzę) - i to wielokrotnie.  Opracowując diagram
 * klas tak, aby implementacja mechanizmów obliczania ceny końcowego
 * produktu była jak najprostsza oraz umożliwiała zmiany (np: dodatkowe
 * rodzaje pizz, dodatków oraz cen itp.) Pamiętaj - 
 * zmiana to jedyny pewnik.
 * @author instruktor
 *
 */
public class Test {

	
	public static void main(String args[]){
		
		
		Składnik kelbasPeperoni = new Składnik();
		kelbasPeperoni.setNazwa("Kiełbasa peperoni");
		kelbasPeperoni.setCena(2d);
		
		Składnik kukurydza = new Składnik();
		kukurydza.setNazwa("kukurydza");
		kukurydza.setCena(1d);
		
		Pizza diavola = new Pizza();
		diavola.setNazwa("Diavola");
		diavola.setCena(19d);
		
		KasaPizzy kasa = new KasaPizzy();
		kasa.setPizza(diavola);
		kasa.getSkładniki().add(kelbasPeperoni);
		kasa.getSkładniki().add(kukurydza);
		
		kasa.wystawParagon();
		
		
		
	}
}
