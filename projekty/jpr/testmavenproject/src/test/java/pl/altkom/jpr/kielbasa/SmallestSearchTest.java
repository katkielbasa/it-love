/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.kielbasa;

import org.junit.Test;
import static org.junit.Assert.*;

public class SmallestSearchTest {

    public SmallestSearchTest() {
    }

    @Test

    public void SmallestSearchcase1() {
        SmallestSearch t1 = new SmallestSearch();
        int[] tab = {4, 5, 7, 3, 1};
        int wynik = t1.smallestSearch(tab);
        assertEquals(1, wynik);
    }

    @Test

    public void SmallestSearchcase3() {
        SmallestSearch t1 = new SmallestSearch();
        int[] tab = {0,-1 ,0,0};
        int wynik = t1.smallestSearch(tab);
        assertEquals(-1, wynik);
    }
    
      @Test

    public void SmallestSearchcase4() {
        SmallestSearch t1 = new SmallestSearch();
        int[] tab = null;
        Integer wynik = t1.smallestSearch(tab);
        assertEquals(null, wynik);
    }
    @Test

    public void SmallestSearchcase2() {
        SmallestSearch t1 = new SmallestSearch();
        int[] tab = {};
        Integer wynik = t1.smallestSearch(tab);
        assertEquals(null, wynik);
    }
}
