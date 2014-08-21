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
public class Pokoj {

    String kolor;

    public Pokoj(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

}
