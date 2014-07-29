package pl.altkom.jpr.maven.testabc.gps2;


import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author instruktor
 */
public class LocationBrowserTask extends Thread{
    
    private GPSDataBrowser browser = new GPSDataBrowser();
    private GeolocalizationStorage database = new GeolocalizationDabaBaseInMemmory();
    
    
    private boolean stop = false;
    
    public void run(){
        
       while(!stop){
        Coordinates lic = browser.getCurrentLocalization();
        database.store(lic);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(LocationBrowserTask.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
        
    }
    
    
    public void doStop(){
        stop = true;
        
        for (Coordinates coordinates : database.getLog()) {
            System.out.println("coord: "+coordinates);
            
        }
    }

    public void setDatabase(GeolocalizationStorage database) {
        this.database = database;
    }
    
    
    
}
