/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.index;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author instruktor
 */
public class Przedmiot {
    
    private String nazwa;
    private List<Float> oceny = new ArrayList<>();
    
    public float srednia(){
        float suma = 0;
        for (int i = 0; i < oceny.size(); i++) {
            suma  = suma+ oceny.get(i);            
        }
        return suma/oceny.size();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Float> getOceny() {
        return oceny;
    }

    public void setOceny(List<Float> oceny) {
        this.oceny = oceny;
    }

   
    
    
}
