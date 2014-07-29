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
public class HamburgerMaker  extends BurgerMaker{

    
    @Override
    protected void nalozenieSosu() {
        System.out.println("Nakladam jedną porcie sosu");
    }

    @Override
    protected void posypaniePrzypyprawami() {
        System.out.println("Dodaje przyprawy pikantne");
    }

    @Override
    protected void nalozneiSkladnikaMiesnego() {
        System.out.println("Dodaje hamburger");
                
    }

}
