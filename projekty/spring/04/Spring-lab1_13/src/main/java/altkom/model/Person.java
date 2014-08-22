
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Person implements Formatter {

	private String name;

	private String surname;

	@Override
	public String prettyFormat() {
		return name + surname;
	}
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public String getName() {

		return name;
	}

	public String getSurname() {

		return surname;
	}

	public void setName( String name ) {

		this.name = name;
	}

	public void setSurname( String surname ) {

		this.surname = surname;
	}

}
