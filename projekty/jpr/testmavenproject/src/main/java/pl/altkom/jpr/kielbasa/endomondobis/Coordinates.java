package pl.altkom.jpr.kielbasa.endomondobis;

/*this class is creates to define the object type: Coordinates,
 the representation of 2 integers witch represent 2 coordinates:
 Lattitude (values between -90 and 90) and Longitude(values between -180 and 180)
 */
public class Coordinates {
	/* atributes */
	float latitude;
	float longitude;

	/* methods */
	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	/*
	 * Ustalam przedzia�y dla d�ugo�ci i szeroko�ci
	 */
	public static final float minLatitude = -90.0F;
	public static final float maxLatitude = 90.0F;

	public static final float minLongitude = -180.0F;
	public static final float maxLongitude = 180.0F;

	/* constructor */

	public Coordinates(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

}
