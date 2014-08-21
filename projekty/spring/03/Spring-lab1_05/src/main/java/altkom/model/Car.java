

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Car {
    private String kolor;
    private String marka;

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
    

    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
}
}