/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kursant5
 */
public class Sciana {

    String obwod;
    @Autowired
    Tablica tablica;

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public Sciana() {
    }

    public Sciana(String obwod) {
        this.obwod = obwod;
    }

}