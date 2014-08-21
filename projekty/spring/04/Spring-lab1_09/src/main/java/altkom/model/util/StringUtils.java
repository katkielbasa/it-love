package altkom.model.util;


public class StringUtils {
	
	public String wrapNullInEmpty( String str ) {
		
		if ( str == null ) {
			return "";
		}
		
		return str;
		
	}
	
}
