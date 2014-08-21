/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model.editors;

import altkom.model.Car;
import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

/**
 *
 * @author kursant4
 */
public class CarEditor extends PropertyEditorSupport{
   
     @Override   // override przes³anie metodê odziedziczn¹ po PropertyEditorSupport. Przes³ania po to abysmy mogli przerobic te metoda na swoje potrzeby
	public void setAsText( String text ) throws IllegalArgumentException {

		StringTokenizer tokenizer = new StringTokenizer(text,";");
		Car car = new Car( String.valueOf(tokenizer.nextToken()), //pierwszy argumnet
									tokenizer.nextToken());// drugi argument
                
		setValue( car );
	}
}
