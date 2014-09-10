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

//@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
//-wyłaczenie mechanizmu blokowania, w celu synchronizacji- 
//jesli chcemy sami synchronizowac metody na komponencie
//ConcurrencyManagement domyslnie jest na container
@Startup
@Singleton
public class MapDictionary implements Dictionary {

    private Map<String, String> data = new HashMap<>();

//    @Lock(LockType.WRITE)- TO JEST DOMYSLNE, wiec bez tego zapisu jest tak samo
    @Override
    public void addEntry(String key, String value) {
        data.put(key, value);
    }

    @Override
    public String getEntry(String key) {
        return data.get(key);
    }

    @Override
    public List<String> getAll() {
        return new ArrayList<>(data.values());
    }
}
