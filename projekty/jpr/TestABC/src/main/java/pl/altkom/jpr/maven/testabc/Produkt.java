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
public class Produkt {

    public String producent;

    public void printParam() {

        System.out.println("jestem produktem");
    }
    
    public Produkt(){
        System.out.println("Tworze produkt");       
    }
}
