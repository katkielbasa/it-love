/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.gps2;


import pl.altkom.jpr.maven.testabc.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 

/**
 *
 * @author instruktor
 */
public class Test {
    
    public static void main(String[] args){
        
        
//        Ekran e = new Ekran();
//        e.szerokosc=600;
//        e.wysokosc = 200;
//        
//        Telefon t = new Telefon();
//        t.ekran = e;
//        
//        System.out.println(t.ekran.szerokosc);
        
        LocationBrowserTask t = new LocationBrowserTask();
//        t.setDatabase(new GeolocalizationMySqlImpl());
        t.start();
        
        try {
            Thread.sleep(10000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t.doStop();
        
    }
    
}
