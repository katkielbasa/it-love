/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.training.service;

import javax.ejb.Remote;

/**
 *
 * @author kursant1
 */
@Remote
public interface IdGenerator {
    long nextId();
}
