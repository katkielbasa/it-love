/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kursant1
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setMarka("Audi");
        Car car2 = new Car();
        car2.setMarka("Mercedes");
        List<Car> cars = new ArrayList();
        cars.add(car1);
        cars.add(car2);

        for (int i = 0; i < cars.size(); i++) {
            //wez pierwszy element z listy podstaw pod car, potem nastepny
            Car anyCar = cars.get(i);
            System.out.println(anyCar.getMarka());
        }

       //for (Car jakiesAuto : cars) {
         //   System.out.println(jakiesAuto.getMarka());
        //}

    }
  
}
