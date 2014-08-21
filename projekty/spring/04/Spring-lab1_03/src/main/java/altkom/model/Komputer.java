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
public class Komputer {
    
    private long id;
    private String marka;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    
    @Override
	public String toString() {    // metoda skopiowana z klasy Address
		
		return ToStringBuilder.reflectionToString( this );
	}
}
