
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

@Component
public class Tablica {
    public String kolor = "zielony";
    
    
     @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
    
}

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
        
}