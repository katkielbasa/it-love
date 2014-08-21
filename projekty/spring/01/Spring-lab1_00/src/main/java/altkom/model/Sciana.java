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
 * @author kursant1
 */
public class Sciana {
    
@Autowired
    Tablica tablica;
    String obwod;

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }

    public Tablica getTablica() {
        return tablica;
    }

    public void setTablica(Tablica tablica) {
        this.tablica = tablica;
    }

    public String getObwod() {
        return obwod;
    }

    public void setObwod(String obwod) {
        this.obwod = obwod;
    }

}
