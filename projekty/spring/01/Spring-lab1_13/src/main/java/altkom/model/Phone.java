package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Phone implements Formatter {

	public static final String SPACE = " ";
	
	private PhoneType type = PhoneType.MOBILE;
	
	private String countryNumber;
	
	private String areaNumber;
	
	private String phoneNumber;
	
	public String prettyFormat() {
		String result
			= getCountryNumber()
			+ SPACE
			+ getAreaNumber()
			+ SPACE
			+ getPhoneNumber();
		
		return result; 
	}
	
	@Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}
	
	public PhoneType getType() {
		
		return type;
	}

	
	public String getCountryNumber() {
	
		return countryNumber;
	}

	
	public String getAreaNumber() {
	
		return areaNumber;
	}

	
	public String getPhoneNumber() {
	
		return phoneNumber;
	}

	
	public void setType( PhoneType phoneType ) {
	
		this.type = phoneType;
	}

	
	public void setCountryNumber( String countryNumber ) {
	
		this.countryNumber = countryNumber;
	}

	
	public void setAreaNumber( String areaNumber ) {
	
		this.areaNumber = areaNumber;
	}

	
	public void setPhoneNumber( String phoneNumber ) {
	
		this.phoneNumber = phoneNumber;
	}
	
}
