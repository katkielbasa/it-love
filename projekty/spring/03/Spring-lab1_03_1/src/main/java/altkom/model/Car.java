
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Car {
    private long key;
    private String kolor;

    public long getKey() {
        return key;
    }

    public void setKey(long key) {
        this.key = key;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    
    @Override
    public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
}
}
