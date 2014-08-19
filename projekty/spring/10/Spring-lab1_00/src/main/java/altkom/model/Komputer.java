/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.model;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 *
 * @author kursant10
 */
public class Komputer {
    String kolor ;
    String marka ;

    
    
    public Komputer() {
        
    }
    

    public Komputer(String kolor, String marka) {
        super();
        this.kolor = kolor;
        this.marka = marka;
        
        
        

    }
    @Override
    public String toString(){
        return ToStringBuilder.reflectionToString(this);
    }
    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;

}
}