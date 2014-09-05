package pl.training.viev.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import pl.training.entity.Client;
import pl.training.services.ClientsRepository;

@ViewScoped
@ManagedBean
public class Manager {

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Inject
    private ClientsRepository repository;
    private String filterValue;
    private ClientsRepository.FilterType filterType
            = ClientsRepository.FilterType.LAST_NAME;

    public ClientsRepository.FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(ClientsRepository.FilterType filterType) {
        this.filterType = filterType;
    }
    private List<Client> clients;

    @PostConstruct
    public void init() {
        clients = repository.getAll();
    }

    public String getFilterValue() {
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

    public void filter() {
        clients = repository.getAll(filterType, filterValue);
    }

    public void reset() {
        filterType = ClientsRepository.FilterType.LAST_NAME;
        filterValue = null; //zamiast null może być ""
        init();
    }
    
    public void resetFilterValue() {
        filterValue = "";
    }
}
