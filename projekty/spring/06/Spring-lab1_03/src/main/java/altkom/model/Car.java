/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant6
 */
public class Car {
    Long numer;
    String kolor;

    public Long getNumer() {
        return numer;
    }

    public void setNumer(Long numer) {
        this.numer = numer;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
     @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
}
