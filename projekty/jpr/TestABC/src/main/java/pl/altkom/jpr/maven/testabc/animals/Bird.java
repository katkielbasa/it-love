/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.animals;

import pl.altkom.jpr.maven.testabc.animals.flymech.FlyMechanizm;
import pl.altkom.jpr.maven.testabc.animals.flymech.WingFly;

/**
 *
 * @author instruktor
 */

public abstract class Bird  extends Animal implements  Flayable{

    public FlyMechanizm fm = new WingFly();
    @Override
    public void fly() {
        fm.perfomFly();
    }

    
}
