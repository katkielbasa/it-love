/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.gps2;

import java.util.List;

/**
 *
 * @author instruktor
 */
public interface GeolocalizationStorage {
    
    public void store(Coordinates c);
    public List<Coordinates> getLog();
}
