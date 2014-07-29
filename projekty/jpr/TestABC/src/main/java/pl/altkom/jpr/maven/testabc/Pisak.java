/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc;

/**
 *
 * @author instruktor
 */
public class Pisak extends Produkt{
    
    public String kolor = "czarny";
    
   
    public void printParam() {
        System.out.println("jestem pisakiem " );
//        super.printParam();
//        System.out.println("kolor: " + kolor);
    }
    
    public Pisak(){
        System.out.println("Tworze Pisak");       
    }
    
    public void costam(){
       
    }
}
