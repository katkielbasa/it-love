/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant5
 */
public class Szyba {

    private String waga;

    public Szyba() {
    }

    public Szyba(String waga) {
        this.waga = waga;
    }

//    public String getWaga() {
//        return waga;
//    }
//
//    public void setWaga(String waga) {
//        this.waga = waga;
//    }
//
    @Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this);
    }
}
