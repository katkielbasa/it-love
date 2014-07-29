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
public class Index {
    
   private String imieINazwiskoStudenta;
   private String numerIndexu;
   private List<Przedmiot> przedmioty = new ArrayList<>();

    public String getImieINazwiskoStudenta() {
        return imieINazwiskoStudenta;
    }

    public void setImieINazwiskoStudenta(String imieINazwiskoStudenta) {
        this.imieINazwiskoStudenta = imieINazwiskoStudenta;
    }

    public String getNumerIndexu() {
        return numerIndexu;
    }

    public void setNumerIndexu(String numerIndexu) {
        this.numerIndexu = numerIndexu;
    }

    public List<Przedmiot> getPrzedmioty() {
        return przedmioty;
    }

    public void setPrzedmioty(List<Przedmiot> przedmioty) {
        this.przedmioty = przedmioty;
    }
   
   public float srednia(){
       return sumujSrednie() / przedmioty.size();       
   }

   
   
   
    private float sumujSrednie() {
        float suma = 0;
        for (Przedmiot przedmiot : przedmioty) {
            suma = suma + przedmiot.srednia();
        }return suma;
    }
}
