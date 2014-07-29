package pl.altkom.jpr.kielbasa.endomondobis;

import java.util.ArrayList;
import java.util.List;

public class EndomondoTest {

	public static void main(String[] args) {
		List<Coordinates> list = new ArrayList<Coordinates>();
		GeolocalisationDataBase geoDb = new GeolocalisationDataBase(list);
		GPSDataBrowser gps = new GPSDataBrowser();
		MapActualisator mapact = new MapActualisator();
		LocationBrowserTask locbt = new LocationBrowserTask(gps, 10000, geoDb,
				mapact);

		locbt.start();
		while (true) {
		}

	}

}
