/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

/**
 *
 * @author kursant5
 */
@Component
public class Tablica {

    String kolor = "czarny";

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public Tablica(String kolor) {
        this.kolor = kolor;
    }

    public Tablica() {
    }

}
