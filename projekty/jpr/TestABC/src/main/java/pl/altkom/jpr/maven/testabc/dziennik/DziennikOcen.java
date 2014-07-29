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
public class DziennikOcen {
    
    private List<Przedmiot> przedmoty = new ArrayList<>();

    public List<Przedmiot> getPrzedmoty() {
        return przedmoty;
    }

    public void setPrzedmoty(List<Przedmiot> przedmoty) {
        this.przedmoty = przedmoty;
    }
    
    public float sredniaStudenta(String nazwaUcznia){
        
        float sumaSrednichZprzedmiotow = 0;
        int liczbaPrzedmiotowUcznia = 0;
        for (Przedmiot przedmiot : przedmoty) {
            for (OcenyUcznia ocenyUcznia : przedmiot.getOceny()) {
                if(ocenyUcznia.getUczen().equals(nazwaUcznia)){
                    liczbaPrzedmiotowUcznia++;
                    sumaSrednichZprzedmiotow = sumaSrednichZprzedmiotow + ocenyUcznia.srednia();
                }
            }
        }
        return sumaSrednichZprzedmiotow / liczbaPrzedmiotowUcznia;
    }
    
}
