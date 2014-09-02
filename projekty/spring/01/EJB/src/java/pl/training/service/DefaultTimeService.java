package pl.training.service;

import java.text.NumberFormat;
import java.util.Date;
import javax.ejb.Stateless;

@Stateless
public class DefaultTimeService implements TimeService {

    @Override
    public String getTime() {
        NumberFormat numberFormat = NumberFormat.getInstance();
        return numberFormat.format(new Date());

    }
}
