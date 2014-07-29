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
public class Test {

    public static void main(String args[]) {

        ChickenBurgerMaker bm = new ChickenBurgerMaker();
        bm.prepare();
        System.out.println("-----------");
        HamburgerMaker hm = new HamburgerMaker();
        hm.prepare();

        int w = 20;
 
    }

    public void doCostam(int w, String state) {

        if (isAdult(w, state)) {
      
        }
    }

    private static boolean isAdult(int w, String state) {
        return ((w >= 18) && (!state.equals("Texas")))
                || ((w >= 21) && (state.equals("Texas")));
    }
}
