/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant10
 */
public class Car {
    private Long id = 0l;
    private String name = "BMW";
    
    @Override
    public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
   
   
    
    
    
}
