/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author kursant1
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Drzwi drzwi1 = new Drzwi(45, "zielony");
        Drzwi drzwi2 = new Drzwi(46, "czerwony");

        Map<Long, Drzwi> asortyment = new LinkedHashMap<Long, Drzwi>();
        asortyment.put(0L, drzwi1);
        asortyment.put(1L, drzwi2);
//to bedzie z HashMap:(bez Linked), tu beda sie wybierały w kolejnosci losowej        // for (Drzwi drzwi : asortyment.values()) {
        //   System.out.println(drzwi.getKolor());
        //}

        Drzwi temp= asortyment.get(0L);
        System.out.println(temp.getKolor());
        
        for (Map.Entry<Long, Drzwi> entry : asortyment.entrySet()) {
            Drzwi drzwi = entry.getValue();
            System.out.println(drzwi.getId() + " " + drzwi.getKolor());
        }
    }

}
