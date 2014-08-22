/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package altkom.controller;
import altkom.model.repository.PhoneBookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author kursant5
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        PhoneBookRepository phoneBookRepository = null;
        
        List list1 = phoneBookRepository.findAllPersons();
        List list2 = phoneBookRepository.findAllCars();
        List list3 = null;

        for (int i = 0; i < list1.size(); i++) {
            list3.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            list3.add(list2.get(i));
        }
        System.out.println(list3);
    }
    
}
