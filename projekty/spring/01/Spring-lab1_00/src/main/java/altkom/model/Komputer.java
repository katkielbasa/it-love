/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant1
 */
public class Komputer {
    private String kolor;
    private String marka;

    public Komputer(String kolor, String marka) {
        this.kolor = kolor;
        this.marka = marka;
    }
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
     
}
