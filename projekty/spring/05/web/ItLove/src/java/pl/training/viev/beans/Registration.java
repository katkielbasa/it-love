package pl.training.viev.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import pl.training.entity.Client;
import pl.training.services.ClientsRepository;

@RequestScoped
@ManagedBean
public class Registration {
    
    @Inject
    private ClientsRepository repository;
    private Client client = new Client();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public String save() {
//        System.out.println("Zapis nowego klienta");
        repository.add(client);
        return "index?faces-redirect=true";
    }
    
}
