

package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Komputer {
    private long id;
    private String marka;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
