package pl.altkom.jpr.kielbasa.endomondobis;

import java.util.List;

/*This class is collecting information about the route that a user made. Informations are the coordinates 
 stocket in the table*/

public class GeolocalisationDataBase {
	//metoda tworzy list� wsp�rz�dnych
	private List<Coordinates> coordinates;

	//lista tworzona przez dopisywanie kolejnych wsp�rz�dnych
	public void pushCoordinates(Coordinates coords) {

		coordinates.add(coords);
	}

	public List<Coordinates> getCoordinates() {
		return this.coordinates;
	}
	
	//constructor
	public GeolocalisationDataBase(List<Coordinates> coordinates) {
		this.coordinates = coordinates;
	}
}