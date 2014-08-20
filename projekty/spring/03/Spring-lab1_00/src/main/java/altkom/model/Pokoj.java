
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Pokoj {
    private String kolor;
    
    public Pokoj(){
        
    }
    public Pokoj(String kolor){
        this.kolor=kolor;
    }
    @Override
    public String toString(){
       return ToStringBuilder.reflectionToString(this);
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    
}
