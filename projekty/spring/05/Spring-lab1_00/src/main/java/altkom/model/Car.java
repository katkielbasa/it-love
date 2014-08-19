/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.stereotype.Component;

/**
 *
 * @author kursant5
 */

@Component
public class Car {

    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }
    private long id = 0;
    private String name = "Ursus";

    public Car() {
    }

    public Car(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
