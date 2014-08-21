/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.controller;

import altkom.model.Category;
import altkom.model.Entry;
import altkom.model.repository.PhoneBookRepository;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author kursant1
 */
@Controller
@RequestMapping("/addEntry3.do")

public class AddEntryController3 {

    private final static String FORM_VIEW = "addEntryForm";

    private final static String SUCCESS_VIEW = "home";

    @Resource(name = "inMemoryRepository")
    private PhoneBookRepository phoneBookRepository;

    @RequestMapping(method = RequestMethod.GET)

    public String setupForm(Model model) {
        model.addAttribute("entry", new Entry());
        model.addAttribute("categories", prepareCategories());

        return FORM_VIEW;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute Entry entry) {

        System.out.println("Category = " + entry.getCategory());
        System.out.println("komputer-wielkosc:" + entry.getKomputer().getWielkosc());
        System.out.println("komputer-nazwa:" + entry.getKomputer().getNazwa());
        //  ---zapis do {  bazy   }  i zalogowanie
        return SUCCESS_VIEW;

    }

    public List prepareCategories() {
        List categories = new ArrayList();
        categories.add(Category.DEFAULT);
        categories.add(Category.CUSTOMER);
        categories.add(Category.BUSINESS_PARTNER);
        categories.add(Category.SERVICE_DELIVERER);

        return categories;
    }
}
