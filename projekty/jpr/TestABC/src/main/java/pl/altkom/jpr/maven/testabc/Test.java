/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc;

import java.util.logging.Level;
import java.util.logging.Logger;
import pl.altkom.jpr.maven.testabc.gps.LocationBrowserTask;

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
        
        
//        Pisak p = new Pisak();
//        p.producent = "ABC";     
//        p.kolor ="Czerwony";
//        p.printParam( );
        
//        Produkt p1 = new Pisak();
//       p1.printParam();
//        
//      
//     
////        
////        p1.producent="asdasdasd";
////        p1.printParam();
//        if (p1 instanceof Myszka){
//            Myszka orgPisak =(Myszka)p1;
//        }
        
//        orgPisak.kolor = "bury";
        
        
//        p1.printParam();
//        
//        
//        Myszka m = new Myszka();
//        m.producent ="asdasd";
//        m.liczbaKlawiszy= 3;        
//        m.printParam();
        
        Produkt[] produkty = new Produkt[4];
        produkty[0] = new Myszka();
        produkty[1] = new Pisak();
        produkty[2] = new Pisak();
        produkty[3] = new Myszka();
        
        
        Test test =new Test();
        test.printInfo(produkty);
    }
    
    
    public void printInfo(Produkt[] produkty){
        for (int i = 0; i < produkty.length; i++) {
            Produkt produkt = produkty[i];
            produkt.printParam();
        }
        
    }
    
}

