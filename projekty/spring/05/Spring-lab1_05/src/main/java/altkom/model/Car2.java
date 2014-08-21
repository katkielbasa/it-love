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
public class Car2 {

    private String kolor;
    private String marka;

    public Car2(String kolor, String marka) {
        super();
        this.kolor = kolor;
        this.marka = marka;
    }

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public Car2() {
        super();
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
