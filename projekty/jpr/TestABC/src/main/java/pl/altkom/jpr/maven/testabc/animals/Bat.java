    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.maven.testabc.animals;

import java.util.logging.Level;
import java.util.logging.Logger;
import pl.altkom.jpr.maven.testabc.animals.flymech.AngiGravityMech;
import pl.altkom.jpr.maven.testabc.animals.flymech.EngineFly;
import pl.altkom.jpr.maven.testabc.animals.flymech.FlyMechanizm;
import pl.altkom.jpr.maven.testabc.animals.flymech.NotFly;
import pl.altkom.jpr.maven.testabc.animals.flymech.WingFly;

/**
 *
 * @author instruktor
 */
public class Bat extends Mammal implements Flayable {

    private FlyMechanizm fm;

    public Bat() {
       ConfigurationReader reader = new ConfigurationReader();
        
        String klasa = reader.readConfigClass();
        try {
            

            Object tymczasowyObjektBezTypu = Class.forName(klasa).newInstance();
            fm = (FlyMechanizm)tymczasowyObjektBezTypu;

        } catch (Exception ex) {
            Logger.getLogger(Bat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void fly() {
//        System.out.println("Latam - Batman");    
        fm.perfomFly();
    }

//    public FlyMechanizm getFm() {
//        return fm;
//    }
//
    public void setFm(FlyMechanizm fm) {
        if (fm instanceof EngineFly){
            System.out.println("to nietoperek, nie da sie latac na silniku!");
            return;
        }
        this.fm = fm;
    }

    public void brokeWing() {
        this.fm = new NotFly();
    }

}
