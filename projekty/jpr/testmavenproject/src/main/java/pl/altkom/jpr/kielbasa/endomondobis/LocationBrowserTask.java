package pl.altkom.jpr.kielbasa.endomondobis;

/*this class is responsible for reading every 10 second a current location of a user during starting with a start signal, sended by GUI
 and finishing with a stop signal sended by GUI*, this class extends a class Threads*/

public class LocationBrowserTask extends Thread {
	//korzysta z nast�puj�cych zmiennych
	private MapActualisator map;
	private GPSDataBrowser gps;
	private boolean end ;
	private long sleepTime;
	private GeolocalisationDataBase geoDb;
	
	//uruchamia w�tek, kt�ry sci�ga co zadany czas(sleeptime) metody gps.getNextCoordinates-bierze now� wsp�rz�dn�,
	//a nast�nie dopisuje j� w geoDb.pushCoordinates(do listy) i  wy�wietla tras� 
	public void run() {
		while (!end) {

			Coordinates coords = gps.getNextCoordinates();

			synchronized (geoDb) {

				geoDb.pushCoordinates(coords);

			}
			map.displayMap(geoDb);
			try {
				sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	//konstruktor
	public LocationBrowserTask(GPSDataBrowser gps, long sleepTime,
			GeolocalisationDataBase geoDb, MapActualisator map) {
		super();
		this.gps = gps;
		this.sleepTime = sleepTime;
		this.geoDb = geoDb;
		this.map = map;
	}


public void doEnd(){
	end = true;	
	
}
}
