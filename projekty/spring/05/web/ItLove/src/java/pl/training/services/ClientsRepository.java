/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.training.services;

import java.util.List;
import pl.training.entity.Client;

/**
 *
 * @author kursant5
 */
public interface ClientsRepository {

    Long add(Client client);

    List<Client> getAll();

}
