/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.dziennik;

/**
 *
 * @author instruktor
 */
public class OcenyUcznia {
  
    private String uczen;
    private float[] oceny;
    
    public float srednia(){
        float suma = 0;
        for (int i = 0; i < oceny.length; i++) {
            suma  = suma+ oceny[i];            
        }
        return suma/oceny.length;
    }

    public String getUczen() {
        return uczen;
    }

    public void setUczen(String uczen) {
        this.uczen = uczen;
    }

    public float[] getOceny() {
        return oceny;
    }

    public void setOceny(float[] oceny) {
        this.oceny = oceny;
    }
 
    
}
