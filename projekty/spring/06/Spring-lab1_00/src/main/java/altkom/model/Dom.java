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
public class Dom {
    String ulica;
    String kolor;

    public Dom() {
    }

    public Dom(String ulica, String kolor) {
        this.ulica = ulica;
        this.kolor = kolor;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
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
