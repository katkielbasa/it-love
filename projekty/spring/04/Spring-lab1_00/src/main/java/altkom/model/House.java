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
public class House {
    private Long id = 01L;
    private String name= "jednorodzinny";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Override
   public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
}
