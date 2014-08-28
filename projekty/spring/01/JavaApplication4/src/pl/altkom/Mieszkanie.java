/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom;

/**
 *
 * @author kursant1
 */
public class Mieszkanie {
    private String nazwa;
    private String kolor;

    public Mieszkanie(String nazwa, String kolor) {
        this.nazwa = nazwa;
        this.kolor = kolor;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
    
}
