package module03.exercise1;

import java.io.IOException;
import org.apache.xerces.parsers.DOMParser;
import org.apache.xerces.parsers.SAXParser;
import org.apache.xerces.parsers.XMLParser;
import org.apache.xerces.xni.parser.XMLInputSource;
import org.xml.sax.SAXException;

public class DomAndSax {

	/**
	 * 
	 * @param fileName nazwa parsowanego pliku
	 * @param iteration liczba iteracji
	 * @param sax true - SAX; false - DOM
	 * @return tablica zawieraj¹ca czasy wykonania
	 * @throws SAXException
	 * @throws IOException
	 */
	double[][] parsuj(String fileName, int iteration, boolean sax)
			throws SAXException, IOException {
		XMLParser parser = null;
		long[][] time = new long[iteration][3];
		double[][] realTime = new double[iteration][3];

		for (int i = 0; i < iteration; i++) {
			time[i][0] = System.nanoTime();
			// Instancja dokumentu XML
			parser = sax ? new SAXParser() : new DOMParser();
			time[i][1] = System.nanoTime();
			XMLInputSource is = new XMLInputSource(null, fileName, null);
			parser.parse(is); // PARSOWANIE
			time[i][2] = System.nanoTime();

			// czas tworzenia instancji dokumentu
			realTime[i][0] = (double) (time[i][1] - time[i][0]) / 1000000;
			// czas parsowania
			realTime[i][1] = (double) (time[i][2] - time[i][1]) / 1000000;
			// czas sumaryczny
			realTime[i][2] = realTime[i][0] + realTime[i][1];

		}
		return realTime;
	}

	public static void main(String[] args) {
		// jako przyklad du¿ego pliku mo¿na u¿yæ plik ULIC.xml (70MB) - metoda
		// DOM nie radzi sobie z plikiem tej wielkosci
		String fileName = "src/module03/exercise1/kalendarium22.xml";
//		String fileName = "module03/exercise1/ULIC.xml";
		final int ITERATION = 10;

		DomAndSax domAndSax = new DomAndSax();
		double sax[][] = null;
		double dom[][] = null;
		try {
			sax = domAndSax.parsuj(fileName, ITERATION, true); // SAX
			dom = domAndSax.parsuj(fileName, ITERATION, false); // DOM
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		} catch (Error e) {
			System.out.println("ERROR: " + e.getClass().getName());
			System.out.println(e.getMessage());
			return;
		}
		System.out.println("Plik poprawny");
		System.out.println("  lp. |  instancja  | parsowanie |   razem    |  instancja  | parsowanie |   razem");
		System.out.println("      |     DOM     |     DOM    |    DOM     |     SAX     |     SAX    |    SAX");
		System.out.println("------+-------------+------------+------------+-------------+------------+------------");
		for (int i = 0; i < ITERATION; i++)
			System.out.printf("%5d |  %7.3f ms | %7.3f ms | %7.3f ms |  %7.3f ms | %7.3f ms | %7.3f ms%n",
							i + 1, dom[i][0], dom[i][1], dom[i][2], sax[i][0],
							sax[i][1], sax[i][2]);
	}
}