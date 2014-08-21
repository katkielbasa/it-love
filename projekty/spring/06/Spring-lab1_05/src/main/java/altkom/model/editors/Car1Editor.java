
package altkom.model.editors;

import altkom.model.Address;
import altkom.model.Car;
import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

/**
 *
 * @author kursant6
 */
public class Car1Editor extends PropertyEditorSupport  {
    @Override
	public void setAsText( String text ) throws IllegalArgumentException {
            
                System.out.println("**********" + text);
		StringTokenizer tokenizer = new StringTokenizer(text,";");
		Car car = new Car(tokenizer.nextToken(),tokenizer.nextToken());
		setValue(car);
	}
}
