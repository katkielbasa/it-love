
package javaapplication3;

import java.util.HashMap;
import java.util.Map;

public class OknoApplication {
    public static void main(String[] args){
        
        Okno ok1= new Okno();
        Okno ok2 = new Okno();
        
        ok1.setSzyba("szklo");
        ok1.setRama("drewno");
        
        ok2.setSzyba("plastik");
        ok2.setRama("plastik");
        
        Map<Long, Okno> lista = new HashMap<>();
        
        lista.put(1l, ok2);
        lista.put(2l, ok1);
        
        for(Okno abc : lista.values()) {
            System.out.println(abc.getRama()+" "+abc.getSzyba());
        }
        
        
    }
}
