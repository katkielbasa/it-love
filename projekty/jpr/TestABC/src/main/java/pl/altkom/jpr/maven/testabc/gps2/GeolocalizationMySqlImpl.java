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
public class GeolocalizationMySqlImpl implements GeolocalizationStorage{
    
    
    public void store(Coordinates c){        
        System.out.println("Zapisjej do bazy Mysql");      
    }
    
    public ArrayList<Coordinates> getLog(){
        return null;
    }
    
}
