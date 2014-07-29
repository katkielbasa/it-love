/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.gps;

/**
 *
 * @author instruktor
 */
public class Coordinates {
    
    private int latitude;
    private int longtitude;

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(int longtitude) {
        this.longtitude = longtitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" + "latitude=" + latitude + ", longtitude=" + longtitude + '}';
    }
    
    
    
}
