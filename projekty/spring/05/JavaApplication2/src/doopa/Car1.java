/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doopa;

/**
 *
 * @author kursant5
 */
public class Car1 {

    private String marka;
    private String model;
    private int rocznik;
    private String rejestracja;

    public Car1(String marka, String model, int rocznik, String rejestracja) {
        this.marka = marka;
        this.model = model;
        this.rocznik = rocznik;
        this.rejestracja = rejestracja;
    }

    public Car1() {
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public String getRejestracja() {
        return rejestracja;
    }

    public void setRejestracja(String rejestracja) {
        this.rejestracja = rejestracja;
    }

}
