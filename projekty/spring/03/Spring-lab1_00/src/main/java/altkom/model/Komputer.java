
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Komputer {
  public String kolor;
  public String marka;
  
  public Komputer(){

  }
  
  public Komputer(String kolor, String marka){
      this.kolor= kolor;
      this.marka= marka; 
  }
  @Override
    public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
}

    public String getKolor() {
        return kolor;
    }

    public String getMarka() {
        return marka;
    }
    
}