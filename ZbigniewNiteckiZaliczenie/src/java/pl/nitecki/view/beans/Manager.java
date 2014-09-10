/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.nitecki.view.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import pl.nitecki.entity.Cargo;
import pl.nitecki.services.CargoRepository;

/**
 *
 * @author znitecki
 */
@ViewScoped
@ManagedBean
public class Manager {
    @Inject
    private CargoRepository repository;
    private List<Cargo> cargos;

    public CargoRepository getRepository() {
        return repository;
    }

    public void setRepository(CargoRepository repository) {
        this.repository = repository;
    }

    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    @PostConstruct
    public void init() {
        cargos = repository.getAll();
    }
    
    public String comeBack() {
        return "index";
    }
}
