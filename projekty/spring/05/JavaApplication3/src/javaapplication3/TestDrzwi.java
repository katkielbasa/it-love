/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kursant5
 */
public class TestDrzwi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drzwi d1 = new Drzwi(1L, "czarny");
        Drzwi d2 = new Drzwi(2L, "zielony");

        Map<Long, Drzwi> map = new HashMap<>();
        map.put(d1.getId(), d1);
        map.put(d2.getId(), d2);
        for (Map.Entry<Long, Drzwi> entry : map.entrySet()) {
            Long key = entry.getKey();
            Drzwi drzwi = entry.getValue();
            System.out.println(key + " / " + drzwi.getKolor());
            System.out.println(entry.getKey() + " / " + entry.getValue().getId()
                    + " / " + entry.getValue().getKolor());    
        }
    }
}
