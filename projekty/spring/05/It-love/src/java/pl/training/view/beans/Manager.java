package pl.training.view.beans;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import pl.training.entity.Client;
import pl.training.service.ClientsRepository;

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
