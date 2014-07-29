/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc;

import java.util.List;
import pl.altkom.jpr.maven.testabc.animals.Flayable;

/**
 *
 * @author instruktor
 */
public class Noe {
    
    //......
    
    public void putAllFlayableToArc(List<Flayable> fl ){
        for (Flayable flayable : fl) {
            flayable.fly();
        }
               
    }
    
    //.....
    
}
