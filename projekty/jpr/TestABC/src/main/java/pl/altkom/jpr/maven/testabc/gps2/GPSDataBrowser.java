package pl.altkom.jpr.maven.testabc.gps2;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instruktor
 */
public class GPSDataBrowser {
    
    
    public Coordinates getCurrentLocalization(){
       
        Coordinates c  = new Coordinates();
        Random r = new Random();
        c.setLatitude(r.nextInt(200));
        c.setLongtitude(r.nextInt(200));
        return c;
    }
    
}
