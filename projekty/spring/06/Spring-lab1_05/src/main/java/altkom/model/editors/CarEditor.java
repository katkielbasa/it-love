/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model.editors;

import altkom.model.Address;
import altkom.model.Car;
import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

/**
 *
 * @author kursant6
 */
public class CarEditor extends PropertyEditorSupport  {
    @Override
	public void setAsText( String text ) throws IllegalArgumentException {
            
                System.out.println("**********" + text);
		StringTokenizer tokenizer = new StringTokenizer(text,";");
		Car car = new Car();
		car.setKolor(tokenizer.nextToken());
		car.setMarka(tokenizer.nextToken());
		setValue(car);
	}
}
