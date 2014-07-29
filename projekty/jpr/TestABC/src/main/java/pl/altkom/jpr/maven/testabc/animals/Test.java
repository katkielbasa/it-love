/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.animals;

import java.util.ArrayList;
import java.util.List;
import pl.altkom.jpr.maven.testabc.Noe;
import pl.altkom.jpr.maven.testabc.animals.flymech.EngineFly;
import pl.altkom.jpr.maven.testabc.animals.flymech.WingFly;

/**
 *
 * @author instruktor
 */
public class Test {
   /**
    * 
    * @param args asdfasdf
    */
    public static void main(String args[]){
        
        
        float[] liczby = { 3, 5.5f };
        
         
//        
//        Kiwi k = new Kiwi();
//        
//        Duck d = new Duck();
//        d.fly();
//        
//        Bat b = new Bat();
//        b.fly();
////        Animal a = new Bird();
////        Bird bird = new Bird();
//        Duck kaczka  = new Duck();
//        
//        Animal an = new Kiwi();
//        kaczka.fly();
//        
        Bat b = new Bat();
        List<Flayable> lista = new ArrayList<>();
        lista.add(new Duck());
        lista.add(b);
        lista.add(new Stork());
        lista.add(new Duck());
        lista.add(new Plane());
        
        Noe noe = new Noe();
        noe.putAllFlayableToArc(lista);
//        
//        b.setFm(new EngineFly());
//        System.out.println("-----------");
//        noe.putAllFlayableToArc(lista);
//        
//        b.brokeWing();
//        System.out.println("-----------");
//        noe.putAllFlayableToArc(lista);
        
        b.setFm(new WingFly());
    }
    
}

