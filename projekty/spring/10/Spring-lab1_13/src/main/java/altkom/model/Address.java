package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Address implements Formatter {

	private String street;
	
	private String number;
	
	private String city;
	
	private String postalCode;

	@Override
	public String prettyFormat() {
		String result
			= number
			+ street + ","
			+ postalCode
			+ city;
		
		return result;
	}
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public void setStreet( String street ) {
	
		this.street = street;
	}

	
	public void setNumber( String number ) {
	
		this.number = number;
	}

	
	public void setCity( String city ) {
	
		this.city = city;
	}

	
	public void setPostalCode( String postalCode ) {
	
		this.postalCode = postalCode;
	}

	
	public String getStreet() {
	
		return street;
	}

	
	public String getNumber() {
	
		return number;
	}

	
	public String getCity() {
	
		return city;
	}

	
	public String getPostalCode() {
	
		return postalCode;
	}
	
}
