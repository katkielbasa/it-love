
package javaapplication2;

import java.util.ArrayList;
import java.util.List;


public class JavaApplication2 {

    public static void main(String[] args) {
      Car syrenka=new Car();
      Car maluch= new Car();
      
      syrenka.setMarka("VW");
      maluch.setMarka("F");
      
      List<Car> lista = new ArrayList<Car>();
      lista.add(maluch);
      lista.add(syrenka);
      
      for ( Car jakiscar : lista){
          System.out.println(jakiscar.getMarka());
      } 
    }

  }
