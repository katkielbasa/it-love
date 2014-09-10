/*
 * Klasa słuząca do rejestrowania nowych towarów w bazie.
 */

package pl.nitecki.view.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import pl.nitecki.entity.Cargo;
import pl.nitecki.services.CargoRepository;

/**
 *
 * @author znitecki
 */

@RequestScoped // bean ograniczony jest do żądania
@ManagedBean // bean jest zarządzany przez framework JSF (Wewnątrz kontenera)
public class Registration {
    @Inject
    private CargoRepository repository;
    private Cargo cargo = new Cargo();

    public Cargo getCargo() { // Tradycyjny getter
        return cargo;
    }

    public void setCargo(Cargo cargo) { // Tradycyjny setter
        this.cargo = cargo;
    }
    
    public String save() { // metoda save. dodaje cargo do repozytorium (tu odwołuje się do metody z interfejsu)
        repository.add(cargo);
        return "index?faces-redirect=true"; // metoda nie jest Void więc coś ma zwracać. Ta zwraca kawałek URLa, pozwalającego na powrót do index.xhtml po kliknięciu "Dodaj towar"
    }
    
}
