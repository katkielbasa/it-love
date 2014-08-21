/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant1
 */
public class Mieszkanie {

    String wielkosc;
    Pokoj pokoj;

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public void setWielkosc(String wielkosc) {
        this.wielkosc = wielkosc;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }

    public String getWielkosc() {
        return wielkosc;
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

}
