
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

public class Szyba {
    public String waga;
    
    public Szyba(){
        
    }
    public Szyba(String waga){
        
    }
    @Override
	public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
}

    public String getWaga() {
        return waga;
    }

    public void setWaga(String waga) {
        this.waga = waga;
    }
        
}
