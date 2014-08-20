
package javaapplication3;

import java.util.HashMap;
import java.util.Map;

public class JavaApplication3 {

    public static void main(String[] args) {
      
      Drzwi d1 = new Drzwi();
      Drzwi d2 = new Drzwi();
      
      d1.setId(12L);
      d1.setKolor("bialy");
      
      d2.setId(01L);
      d2.setKolor("czarny");
      
       Map<Long,Drzwi> mapka = new HashMap<>();
      
      mapka.put(1L, d2);
      mapka.put(2L, d1);
        
        for (Drzwi drzwi : mapka.values()){
            System.out.println(drzwi.getId()+" "+ drzwi.getKolor());
           
        }
    }
    
}
