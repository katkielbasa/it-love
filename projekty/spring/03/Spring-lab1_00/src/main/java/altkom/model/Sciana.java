
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;

public class Sciana {
  @Autowired  
  public Tablica tablica;
  public String obwod;
  
  @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
        }

    public Tablica getTablica() {
        return tablica;
    }

    public void setTablica(Tablica tablica) {
        this.tablica = tablica;
    }

    public String getObwod() {
        return obwod;
    }

    public void setObwod(String obwod) {
        this.obwod = obwod;
    }
        
        
}
