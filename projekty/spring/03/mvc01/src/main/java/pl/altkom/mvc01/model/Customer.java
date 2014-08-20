
package pl.altkom.mvc01.model;

public class Customer {
  int id = 0;
  String name = null;
  String surname = null;
  String address = null;
  String phone = null;
  String komorka = null;
  String narodowosc = null;

  public Customer() {}

    public Customer( int id, String name, 
            String surname, String phone, String address, String komorka, String narodowosc) {
        
        this.id =  id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address =  address;
        this.komorka = komorka;
        this.narodowosc = narodowosc;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
     public String getKomorka() {
        return komorka;
    }

    public void setKomorka(String komorka) {
        this.komorka = komorka;
    }
      public String getNarodowosc() {
        return narodowosc;
    }

    public void setNarodowosc(String narodowosc) {
        this.narodowosc = narodowosc;
    }
}
