package pl.training.viev.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import pl.training.services.ClientsRepository;

@RequestScoped
@ManagedBean
public class Manager {
    
    @Inject
    private ClientsRepository repository;

    public ClientsRepository getRepository() {
        return repository;
    }

    public void setRepository(ClientsRepository repository) {
        this.repository = repository;
    }
    
}
