
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class Okno {
    public String obwod;
    @Autowired
    public Szyba szyba;
    
    
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
	}

    public String getObwod() {
        return obwod;
    }

    public void setObwod(String obwod) {
        this.obwod = obwod;
    }

    public Szyba getSzyba() {
        return szyba;
    }

    public void setSzyba(Szyba szyba) {
        this.szyba = szyba;
    }
        
}
