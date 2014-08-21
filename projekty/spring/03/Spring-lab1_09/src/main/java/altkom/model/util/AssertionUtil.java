package altkom.model.util;


public class AssertionUtil {

	public static void assertTrue( boolean condition, String failMessage ) {
		
		if ( condition == false ) {
			throw new PhoneBookApplicationException( failMessage );
		}
	}
	
}
