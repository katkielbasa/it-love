
package altkom.model.editors;

import altkom.model.Address;
import altkom.model.Car;
import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

public class CarEditor extends PropertyEditorSupport{
    
    @Override
	public void setAsText( String text ) throws IllegalArgumentException {
            
                //System.out.println("**********" + text);
		//Zaimplementuj metode. Przeksztalc lancuch znakow na obiekt Address
		StringTokenizer tokenizer = new StringTokenizer(text,";");
		Car car = new Car();
		car.setKolor(tokenizer.nextToken());
		car.setMarka(tokenizer.nextToken());
		setValue(car);
        }   
}
