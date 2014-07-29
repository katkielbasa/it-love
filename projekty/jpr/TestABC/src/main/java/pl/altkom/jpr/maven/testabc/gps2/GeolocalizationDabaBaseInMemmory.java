package pl.altkom.jpr.maven.testabc.gps2;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instruktor
 */
public class GeolocalizationDabaBaseInMemmory implements GeolocalizationStorage{
    
    private ArrayList<Coordinates> historyLog = new ArrayList<Coordinates>();
    
    public void store(Coordinates c){        
        historyLog.add(c);       
    }
    
    public ArrayList<Coordinates> getLog(){
        return historyLog;
    }
    
}
