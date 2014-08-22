package altkom.model.util.validation;


import altkom.model.Car;
import altkom.model.util.StringUtils;
import org.springframework.validation.Errors;


public class CarValidator {

	public void validate( Car car, Errors errors ) {
		if ( StringUtils.isEmpty( car.getMarka()) ) {
			errors.rejectValue( "car.marka", "required" );
		}
		
		if ( StringUtils.isEmpty( car.getMarka()) ) {
			errors.rejectValue( "car.kolor", "required" );
		}
	}
	
}
