package altkom.model.editors;

import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

import altkom.model.Person;

public class PersonEditor extends PropertyEditorSupport { // PersonEditor dziedziczy po PropertyEditorSupport. PropertyEditorSupport jest przodkiem

	  @Override   // override przes³anie metodê odziedzicozn¹ po PropertyEditorSupport. Przes³ania po to abysmy mogli przerobic te metoda na swoje potrzeby
	public void setAsText( String text ) throws IllegalArgumentException {

		StringTokenizer tokenizer = new StringTokenizer(text,";");
		Person person = new Person(	Long.valueOf(tokenizer.nextToken()),
									tokenizer.nextToken(),
									tokenizer.nextToken());
		setValue( person );
	}
}
