
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;


public class Dom {
    
    private String ulica;
    public String kolor;
    
    
    public Dom(){
        
    }
    public Dom(String ulica, String kolor){
        this.ulica=ulica;
        this.kolor=kolor;
    }
    @Override
    public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    
}
