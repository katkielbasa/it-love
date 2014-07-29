/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.dziennik;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author instruktor
 */
public class Przedmiot {
    private String nazwa;
    
    private List<OcenyUcznia> oceny = new ArrayList<>();

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<OcenyUcznia> getOceny() {
        return oceny;
    }

    public void setOceny(List<OcenyUcznia> oceny) {
        this.oceny = oceny;
    }
    
 
    public float srednia(){
        float sumaSrednich = 0;
        for (OcenyUcznia ocenyUcznia : oceny) {
            sumaSrednich = sumaSrednich+ocenyUcznia.srednia();
        }
        return sumaSrednich / oceny.size();
        
    }
}
