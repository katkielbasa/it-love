/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.maven.testabc.burgermachine;

/**
 *
 * @author instruktor
 */
public abstract class BurgerMaker {

    public void prepare() {
        ustawienieKartonika();
        wlozenieGoryBulki();
        nalozenieSosu();
        nalozenieSalaty();
        posypaniePrzypyprawami();
        nalozneiSkladnikaMiesnego();
        naloznieSpoduBulki();
        zamkneceiWieka();
    }

    private void ustawienieKartonika() {
        System.out.println("UStawiam kartonik");
    }

    private void wlozenieGoryBulki() {
        System.out.println("Wkladam gore bulki");
    }

    protected abstract void nalozenieSosu();

    private void nalozenieSalaty() {
        System.out.println("Nakladam salate");
    }

    protected abstract void posypaniePrzypyprawami() ;

    protected abstract void nalozneiSkladnikaMiesnego();

    private void naloznieSpoduBulki() {
        System.out.println("Nakladam spod builki");
    }

    private void zamkneceiWieka() {
        System.out.println("Zamkniecie wieka");
    }

    private void obrotKartoniak() {
         System.out.println("Obrot kartonika");
    }

}
