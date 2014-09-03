package pl.training.view.beans;


import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import pl.training.entity.Client;
import pl.training.service.ClientsRepository;

@ViewScoped
@ManagedBean

public class Manager {

    @Inject
    private ClientsRepository repository;
    private String filterValue;
    private List<Client>clients;

    @PostConstruct
    public void init() {
        clients = repository.getAll();
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public String getFilterValue(){
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    public ClientsRepository getRepository() {
        return repository;
    }

    public void setRepository(ClientsRepository repository) {
        this.repository = repository;
    }

    public void filter(){
        clients=repository.getAll(ClientsRepository.FilterType.LAST_NAME, filterValue);
    }
}
