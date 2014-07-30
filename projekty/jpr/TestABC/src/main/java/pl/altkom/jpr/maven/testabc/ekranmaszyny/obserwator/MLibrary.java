package pl.altkom.jpr.maven.testabc.ekranmaszyny.obserwator;

import java.util.Random;

public class MLibrary {

	//liczba wyprodukowanych ilość w serii, ilość odrzutów, ilość produkowanych długopisów na minutę oraz aktualny stan pracy maszyny (przestój, produkcja, awaria)
	
	public int getCountOfElementInSerie(){
		Random r = new Random();
		return r.nextInt(150);
	}
	
	public int getTrashedElement(){
		Random r = new Random();
		return r.nextInt(10);
	}
	
	public int getCountElementProducedInMinute(){
		Random r = new Random();
		return r.nextInt(10);
	}
	
	/**
	 * 0 - przestój, 
	 * 1 - produkcja, 
	 * 2 - awaria
	 * @return
	 */
	public int getState(){
		Random r = new Random();
		return r.nextInt(3);
	}
}
