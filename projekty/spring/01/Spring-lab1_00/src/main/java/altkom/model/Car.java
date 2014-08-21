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
public class Car {
    long id=234567L;
    String name="Audi";
//moge stworzyc bean bez construktora argumentowego, wtedy bezargumentowy
    //jest domyslny wiec nie musze pisac zadnego construktora i tak bedzie dzialalalo!!
    
//public Car(){}
    
    //public Car(long id, String name) {
      //  this.id = id;
        //this.name = name;
    //}
@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
        
    //public long getId() {
      //  return id;
    //}

    //public void setId(long id) {
      //  this.id = id;
    //}

    //public String getName() {
      //  return name;
    //}

    //public void setName(String name) {
      //  this.name = name;
    //}
    
}
