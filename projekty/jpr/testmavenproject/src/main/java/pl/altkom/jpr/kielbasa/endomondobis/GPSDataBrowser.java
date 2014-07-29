package pl.altkom.jpr.kielbasa.endomondobis;

import java.util.Random;

/*Ultimately the responsability of this class is to read a current coordinates from GPS tool
 * with the frequence given by LocationBrowserTask.
 In the test mode there is random function that generate the coordinates. */

public class GPSDataBrowser {
	//metoda korzysta z atrybutu Random r, obiektu stworzonego przez klas� Random
	Random r;

	/*
	 * metoda getNextCoordinates zwraca warto�� latitude i longitude,
	 * stworzonych za pomoc� funkcji Random
	 */
	public Coordinates getNextCoordinates() {

		float latitude = r.nextFloat()
				* (Coordinates.maxLatitude - Coordinates.minLatitude)
				+ Coordinates.minLatitude;

		float longitude = r.nextFloat()
				* (Coordinates.maxLongitude - Coordinates.minLongitude)
				+ Coordinates.minLongitude;

		return new Coordinates(latitude, longitude);

	}
	/*constructor*/
	public GPSDataBrowser(){
		this.r = new Random();
	}
}
