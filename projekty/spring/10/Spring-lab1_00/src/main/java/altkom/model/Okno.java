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
 * @author kursant10
 */
public class Okno {
    String obwod;
 
   
    @Autowired
    private Szyba szyba;
    
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public String getObwod() {
        return obwod;
    }

    public void setObwod(String obwod) {
        this.obwod = obwod;
    }

    public Szyba getSzyba() {
        return szyba;
    }

    public void setSzyba(Szyba szyba) {
        this.szyba = szyba;
    }

   
    
}
