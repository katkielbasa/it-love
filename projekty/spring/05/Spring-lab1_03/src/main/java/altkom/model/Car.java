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
public class Car {

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    private Long key;
    private String kolor;

    public Car() {
    }

    public Car(Long key, String kolor) {
        this.key = key;
        this.kolor = kolor;
    }

    public Long getKey() {
        return key;
    }

    public void setKey(Long key) {
        this.key = key;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

}
