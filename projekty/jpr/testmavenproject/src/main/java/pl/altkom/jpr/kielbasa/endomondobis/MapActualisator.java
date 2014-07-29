package pl.altkom.jpr.kielbasa.endomondobis;

/*This class display the information about the route that was made
 (in a form of list of coordinates)
 */
public class MapActualisator {
	//metoda przegl�da list� geoDb  NAST�PNIE WY�WIETLA JEJ ZAWARTO��
	public void displayMap(GeolocalisationDataBase geoDb) {
		synchronized (geoDb) {
			for (Coordinates coords : geoDb.getCoordinates()) {
				System.out.println(coords.getLatitude() + " , "
						+ coords.getLongitude());
			}
		}
	}
}
