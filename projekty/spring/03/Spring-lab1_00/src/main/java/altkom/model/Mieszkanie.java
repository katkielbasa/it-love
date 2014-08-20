
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Mieszkanie {
    public String wielkosc;
    public Pokoj pokoj;
    
    public Mieszkanie(){
        
    }
    public Mieszkanie(String wielkosc, Pokoj pokoj){
        //this.wielkosc=wielkosc;
        //this.pokoj=pokoj;
    }
    
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }

    public String getWielkosc() {
        return wielkosc;
    }

    public void setWielkosc(String wielkosc) {
        this.wielkosc = wielkosc;
    }

    public Pokoj getPokoj() {
        return pokoj;
    }

    public void setPokoj(Pokoj pokoj) {
        this.pokoj = pokoj;
    }
    
}

