/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

/**
 *
 * @author kursant4
 */

@Component   // tworzy sie bean w deklaracji xml, ale musi byc w xml na samej górze :<context:annotation-config/>, zeby czyta³o adnotacje
public class Tablica {
    
    public String kolor= "bialy";

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
