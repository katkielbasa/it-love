/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.maven.testabc;

/**
 *
 * @author instruktor
 */
public class Pies {

    public String kolor;
    public String producent;

    public void method() {

    }

    public int findMinlanValue(int[] inty) {

        int wynik = inty[0];
        for (int i = 1; i < inty.length; i++) {

            if (inty[i] < wynik) {
                wynik = inty[i];
            }
        }
        return wynik;

    }

}
