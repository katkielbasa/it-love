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
public class Car implements Formatter{
    private String marka;
    private String kolor;

    public String getMarka() {
        return marka;
    }

    	@Override
	public String prettyFormat() {
		return marka + kolor;
	}
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
    
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
}
