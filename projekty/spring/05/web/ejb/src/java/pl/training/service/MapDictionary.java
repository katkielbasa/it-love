package pl.training.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

//@ConcurrencyManagement(ConcurrencyManagementType.BEAN) // my zarządzamy wielowątkowością. Wartość domyślna któej nie trzeba deklarować: CONTAINER
@Startup // kontener - jak bedzie wdrozone na serrwer masz nartchmiast stworzyc instancje. // domyslnie - lazyinit
@Singleton
public class MapDictionary implements Dictionary {

    private Map<String, String> data = new HashMap<>();

    //@Lock(LockType.WRITE) //nie trzeba pisać tego LockType.WRITE bo i tak każda metoda domyślnie jest WRITE
    @Override
    public void addEntry(String key, String value) {
        data.put(key, value);
    }
    
    @Lock(LockType.READ)
    @Override
    public String getEntry(String key) {
        return data.get(key);
    }

    @Override
    public List<String> getAll() {
        return new ArrayList<>(data.values());
    }

}
