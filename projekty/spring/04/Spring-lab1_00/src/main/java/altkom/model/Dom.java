/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant4
 */
public class Dom {
    
    private String ulica;
	
    private String kolor;
    
    public Dom () {
        
    }
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getUlica() {
        return ulica;
    }

    public String getKolor() {
        return kolor;
    }
    
        
}
