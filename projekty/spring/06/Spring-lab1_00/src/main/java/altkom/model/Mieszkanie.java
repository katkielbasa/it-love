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
public class Mieszkanie {
    String wielkosc;
    Pokoj pokoj;

    public String getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(String wielkosc) {
        this.wielkosc = wielkosc;
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
}
