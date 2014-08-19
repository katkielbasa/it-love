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
public class Komputer {

    private String marka;
    private String kolor;

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public Komputer() {
    }

    public Komputer(String marka, String kolor) {
        this.marka = marka;
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public String getKolor() {
        return kolor;
    }

}
