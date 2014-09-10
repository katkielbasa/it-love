package pl.training.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;

@Stateful
public class DefaultIdGenerator implements IdGenerator {

    private long lastId;

    @Override
    public long nextId() {
        return ++lastId;
    }

    @Remove
//    po tym wykonuje sie predestroy
    public void stop() {
        System.out.println("Stopping...");
    }

    @PostConstruct
    public void init() {
        System.out.println("DefaultIdGenerator init...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DefaultIdGenerator destroys...");
    }

    @PrePassivate
    public void prePassivate() {
        System.out.println("DefaultIdGenerator is going to passivate...");
    }

    @PostActivate
    public void postActivate() {
        System.out.println("DefaultIdGenerator has been activated...");
    }
}
