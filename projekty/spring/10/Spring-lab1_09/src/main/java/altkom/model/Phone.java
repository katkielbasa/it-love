package altkom.model;


public class Phone {

	public static final String COUNTRY_PREFIX = "+";
	
	public static final String SPACE = " ";
	
	private PhoneType phoneType = PhoneType.MOBILE;
	
	private String countryNumber;
	
	private String areaNumber;
	
	private String phoneNumber;

	
	public String prettyFormat() {
		String result
			= COUNTRY_PREFIX
			+ getCountryNumber()
			+ SPACE
			+ getAreaNumber()
			+ SPACE
			+ getPhoneNumber();
		
		return result; 
	}
	
	public PhoneType getPhoneType() {
		
		return phoneType;
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

	
	public void setPhoneType( PhoneType phoneType ) {
	
		this.phoneType = phoneType;
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
