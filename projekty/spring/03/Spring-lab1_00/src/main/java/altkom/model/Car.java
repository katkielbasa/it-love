
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;


public class Car {
   private Long id = 1009977L;
   private String name = "VW";
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
   
   @Override
   public String toString() {
		
		return ToStringBuilder.reflectionToString( this );
   
}
}
