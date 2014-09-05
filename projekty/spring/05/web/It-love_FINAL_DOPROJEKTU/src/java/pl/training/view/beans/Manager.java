package pl.training.view.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import pl.training.entity.Client;
import pl.training.service.ClientsRepository;

import static pl.training.service.ClientsRepository.*;

@ViewScoped
@ManagedBean
public class Manager {
    
    @Inject
    private ClientsRepository repository;
    private String filterValue;
    private FilterType filterType = FilterType.LAST_NAME;
    private List<Client> clients;
    private String order = LAST_NAME;
    
    @PostConstruct
    public void init() {
        clients = repository.getAll(order);
    }

    public String getFilterValue() {
        return filterValue;
    }

    public void setFilterValue(String filterValue) {
        this.filterValue = filterValue;
    }

    public ClientsRepository.FilterType getFilterType() {
        return filterType;
    }

    public void setFilterType(ClientsRepository.FilterType filterType) {
        this.filterType = filterType;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
    
    public void filter() {
        clients = repository.getAll(filterType, filterValue, order);
    }
    
    public void reset() {
        filterType = ClientsRepository.FilterType.LAST_NAME;
        filterValue = "";
        order = LAST_NAME;
        init();
    }
    
    public void restFilterValue() {
        filterValue = "";
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
}
