                    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.altkom.mvc01.model;

/**
 *
 * @author kursant5
 */
public class Customer {

    int id = 0;
    String name = null;
    String surname = null;
    String address = null;
    String phone = null;
    String pesel = null;

    public Customer() {
    }

    public Customer(int id, String name, String address, String phone, String surname, String pesel) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phone = phone;
        this.id = id;
        this.pesel = pesel;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
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

}
