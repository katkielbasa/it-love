package pl.training.service;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface Dictionary {

    void addEntry(String key, String value);

    String getEntry(String key);

    List<String> getAll();

}
