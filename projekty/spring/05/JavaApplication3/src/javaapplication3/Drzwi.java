/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author kursant5
 */
public class Drzwi {

    Long id;
    String kolor;

    public Drzwi(Long id, String kolor) {
        this.id = id;
        this.kolor = kolor;
    }

    public Drzwi() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

}
