/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doopa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kursant5 8=====D
 */
public class TestApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car1 car1 = new Car1("Polonez", "Caro", 1967, "DW3234L");
        Car1 car2 = new Car1("Maluch", "126p", 1974, "DKL45FL");
        Car1 car3 = new Car1("Porshe", "Cayenne", 2013, "DW3323L");

        List<Car1> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        for (Car1 car : cars) {
            System.out.println(car.getMarka() + " " + car.getModel() + ", rocznik: " + car.getRocznik() + "; rejestracja: " + car.getRejestracja());
        }
    }

}
