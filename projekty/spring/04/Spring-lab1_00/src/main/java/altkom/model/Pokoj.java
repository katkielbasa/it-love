/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.model;

/**
 *
 * @author kursant4
 */
public class Pokoj {
  private String kolor;
  public Pokoj(){
      super();
  }
  public Pokoj (String kolor){
      super();
      this.kolor=kolor;
  }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }
  
    
    
    
}
