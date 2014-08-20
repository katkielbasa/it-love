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
 * @author kursant5 8=====D
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car car1 = new Car("Polonez");
        Car car2 = new Car("Maluch");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);

        for (Car car : cars) {
            System.out.println(car.getMarka());
        }
    }

}
