/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;



public class Car {
    private String kolor;
    private String marka;

    public Car(String kolor, String marka) {
        this.kolor = kolor;
        this.marka = marka;
    }

    public Car(){
        
        
    }
 
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    
}
