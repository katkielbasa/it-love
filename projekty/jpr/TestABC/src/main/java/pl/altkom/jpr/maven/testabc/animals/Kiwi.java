/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package pl.altkom.jpr.maven.testabc.animals;

import pl.altkom.jpr.maven.testabc.animals.flymech.NotFly;


/**
 *
 * @author instruktor
 */
public class Kiwi extends Bird{
 
    public Kiwi(){
        this.fm = new NotFly();
    } 
}
