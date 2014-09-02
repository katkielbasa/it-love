package pl.training.service;

import java.text.DateFormat;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class DefaultTimeService implements TimeService {

    @Override
    public String getTime() {
        return DateFormat.getInstance().format(new Date());
    }
    @PostConstruct
    public void init() {
        System.out.println("DefaultTimeService init...");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("DefaultTimeService destroy...");
    }
}
