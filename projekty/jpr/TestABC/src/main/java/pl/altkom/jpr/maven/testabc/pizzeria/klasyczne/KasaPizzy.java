package pl.altkom.jpr.maven.testabc.pizzeria.klasyczne;

import java.util.ArrayList;
import java.util.List;

public class KasaPizzy {

	
	private Pizza pizza;
	
	private List<Składnik> składniki = new ArrayList<>();

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}

	public List<Składnik> getSkładniki() {
		return składniki;
	}

	public void setSkładniki(List<Składnik> składniki) {
		this.składniki = składniki;
	}
	
	
	
	
	public void wystawParagon(){
		
		double razem = pizza.getCena();
		System.out.println("Pizza "+pizza.getNazwa() +" = "+pizza.getCena());
		
		for (Składnik składnik : składniki) {
				System.out.println("dodatek "+składnik.getNazwa() +" = "+składnik.getCena());
				razem = razem + składnik.getCena();
		}
		System.out.println("------------");
		System.out.println("Razem: "+razem);
	}
	
	
	
}
