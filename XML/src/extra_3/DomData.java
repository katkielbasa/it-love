package extra_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class DomData {

	public static void main(String[] args) {
		String fileName = "src/extra_3/kalendarium22.xml";
		// Uwaga! Klasa 'DomData' dziala dla plikow XML zawierajacych elementy o
		// nazwie 'cena', ktorych zawartosc jest liczba calkowita

		// Instancja parsera dla metody DOM
		DOMParser parser = new DOMParser();
		// PARSOWANIE
		try {
			parser.parse(new InputSource(new FileInputStream(fileName)));
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Document doc = parser.getDocument();
		System.out.println("Kodowanie: " + doc.getXmlEncoding());
		System.out.println("Wersja XML: " + doc.getXmlVersion());
		Element root = doc.getDocumentElement();
		NodeList priceElements = root.getElementsByTagName("cena");
		float average = 0;
		int noOfElements = priceElements.getLength();
		for (int i = 0; i < noOfElements; i++) {
			Element priceElement = (Element) priceElements.item(i);
			Text priceText = (Text) priceElement.getFirstChild();
			String price = priceText.getData();
			System.out.println(priceElement.getNodeName() + ": " + price);
			average += Integer.valueOf(price);
		}
		average /= noOfElements;
		System.out.printf("Œrednia cena = %.2f", average);
	}
}