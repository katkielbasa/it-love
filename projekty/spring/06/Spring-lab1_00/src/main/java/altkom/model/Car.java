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
public class Car {
   long id;
   String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
    }

    public Car(long id, String name) {
        this.id = id;
        this.name = name;
    }
   
  @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
           
}
