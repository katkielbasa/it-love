/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant5
 */
public class Pokoj {

    private String kolor;

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

    public Pokoj(String kolor) {
        this.kolor = kolor;
    }

    public Pokoj() {
    }
}
