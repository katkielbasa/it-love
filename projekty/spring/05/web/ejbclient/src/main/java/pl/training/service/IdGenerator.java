package pl.training.service;

import javax.ejb.Remote;

@Remote
public interface IdGenerator {

    long nextId();

}
