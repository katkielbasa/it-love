/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.jpr.maven.testabc.index;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author instruktor
 */
public class Test {

    public static void main(String[] args) {

        Index index = new Index();

        index.setNumerIndexu("ASDASDASD");
        index.setImieINazwiskoStudenta("Jan Kowalski");

        Przedmiot fizyka = new Przedmiot();
        fizyka.setNazwa("Fizyka");
       
        fizyka.getOceny().add(4f);
        fizyka.getOceny().add(3f);
        fizyka.getOceny().add(2f);

        Przedmiot mata = new Przedmiot();
        mata.setNazwa("Mata");
        
        List<Float> oceny = new ArrayList<>();
        oceny.add(3f);
        oceny.add(2f);
        oceny.add(5f);
        mata.setOceny(oceny);

        index.getPrzedmioty().add(mata);
        index.getPrzedmioty().add(fizyka);
        
        System.out.println("Średnia z fizy: "+fizyka.srednia());
        System.out.println("Średnia z maty: "+mata.srednia());
        System.out.println("Średnia łączna: "+index.srednia());

        
        
    }
}
