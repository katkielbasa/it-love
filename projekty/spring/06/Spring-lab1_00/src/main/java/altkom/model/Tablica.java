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
 * @author kursant6
 */
@Component
public class Tablica {
   private String kolor = "czerwony";

    public String getKolor() {
        return kolor;
    }

    
  @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}  
}
