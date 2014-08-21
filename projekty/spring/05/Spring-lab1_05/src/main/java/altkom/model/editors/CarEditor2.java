/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model.editors;

import altkom.model.Car;
import altkom.model.Car2;
import java.beans.PropertyEditorSupport;
import java.util.StringTokenizer;

/**
 *
 * @author kursant5
 */
public class CarEditor2 extends PropertyEditorSupport {
        @Override
        
    public void setAsText(String text) throws IllegalArgumentException {

        System.out.println("**********" + text);
        //Zaimplementuj metode. Przeksztalc lancuch znakow na obiekt Address
        StringTokenizer tokenizer = new StringTokenizer(text, ";");
        Car2 car2 = new Car2();
        car2.setKolor(String.valueOf(tokenizer.nextToken()));
        car2.setMarka(tokenizer.nextToken());
        setValue(car2);
    }

}
