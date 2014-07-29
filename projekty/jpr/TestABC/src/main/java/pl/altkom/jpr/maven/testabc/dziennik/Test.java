/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.jpr.maven.testabc.dziennik;

/**
 *
 * @author instruktor
 */
public class Test {
    public static void main(String[] args){
        
        
        OcenyUcznia uczen1 = new OcenyUcznia();
        uczen1.setUczen("Kowalski jan");        
        float[] oceny = {4f, 5f, 4.5f, 3f};
        uczen1.setOceny(oceny);
        System.out.println("kowalski z fizy: " +uczen1.srednia());
        
        OcenyUcznia uczen2 = new OcenyUcznia();
        uczen2.setUczen("Nowak Jan");        
        float[] oceny2 = {5f, 6f, 4.5f, 4f};
        uczen2.setOceny(oceny2);
        System.out.println("nowak z fizy: "+uczen2.srednia());
        
        Przedmiot fizyka = new Przedmiot();
        
        fizyka.setNazwa("Fizyka");
        fizyka.getOceny().add(uczen1);
        fizyka.getOceny().add(uczen2);
        
        
          OcenyUcznia uczen3 = new OcenyUcznia();
        uczen3.setUczen("Kowalski jan");        
        float[] oceny3 = {3f, 2f, 2.5f, 3f};
        uczen3.setOceny(oceny3);
        System.out.println("kowalski z maty: " +uczen3.srednia());
        
        OcenyUcznia uczen4 = new OcenyUcznia();
        uczen4.setUczen("Nowak Jan");        
        float[] oceny4 = {2f, 3f, 3.5f, 4f};
        uczen4.setOceny(oceny4);
        System.out.println("nowak z maty: "+uczen4.srednia());
        
        Przedmiot mata = new Przedmiot();
        
        mata.setNazwa("Matematyka");
        mata.getOceny().add(uczen3);
        mata.getOceny().add(uczen4);
        
        DziennikOcen dziennik =new DziennikOcen();
        dziennik.getPrzedmoty().add(mata);
        dziennik.getPrzedmoty().add(fizyka);
        
        for (Przedmiot przedmiot : dziennik.getPrzedmoty()) {
            System.out.println("średnia uczniow z "+ przedmiot.getNazwa() + " = "+przedmiot.srednia());            
        }
 
        System.out.println("Wynik Nowaka z jego dzienia  = "+dziennik.sredniaStudenta("Nowak Jan"));    
    }
}
