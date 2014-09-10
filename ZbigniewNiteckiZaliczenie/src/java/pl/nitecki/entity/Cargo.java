/*
 * Klasa Cargo odpowiada za reprezentację danych towaru.
 */
package pl.nitecki.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author znitecki
 */
@Table(name = "goods")
@Entity
public class Cargo implements Serializable {

    public enum Category { // Lista kategorii w postaci enuma

        UNCATEGORIZED, OFFICE, BOOKS, EBOOKS, CALENDARS, CD, VINYL
    }

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "cargo_name") // adnotacja @Column nadpisuje domyślną nazwę dla kolumny w tabeli bazy danych z cargoName na cargo_name itp.
    private String cargoName; // Nazwa towaru
    private String description; // Opis towaru
    private BigInteger price; // Cena towaru, jako BigInteger. Klasa BigInteger sprawia że działanai matematyczne na tej klasie są dokładne, nie generują błędów.
    private String amount; // Ilość towaru
    private Category category = Category.UNCATEGORIZED;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
}
