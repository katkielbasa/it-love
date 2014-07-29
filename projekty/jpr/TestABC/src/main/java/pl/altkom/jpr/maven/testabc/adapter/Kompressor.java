package pl.altkom.jpr.maven.testabc.adapter;

/**
 * Treść zadania:
 * Przez ostatnie lata w naszym systemie prezentacji filmów
 * zaimplementowano 6 bardzo wydajnych i unikalnych bibliotek
 * kompresji obrazu. Każda klasa reprezentowała jeden 
 * typ kompresji oraz implementowała interfejs kompresor 
 * (deklarujący metody: kompresu, dekompresuj, wyświetl).  
 * Prezes zakupił ostatnio nową, prototypową bibliotekę kompresji. 
 * Niestety nie dostaliśmy kodu źródłowego a dostęp był realizowany 
 * przez dwie klasy: SuperCompressor (posiadający metodę compress), 
 * SuperDecompressor (posiadający metodę decompress). Wyświetlenie 
 * było realizowane przez metodę show klasy Presenter.  
 * Przedstaw diagram naszego systemu, tak aby uwzględniał 
 * nowo zakupioną bibliotekę. Pamiętaj że system ma być otwarty 
 * na rozbudowę, lecz zamknięty na zmiany.
 * @author instruktor
 *
 */
public interface Kompressor {
	
	public void komresuj();
	public void wyswietl();
	public void dekompresuj();

}
