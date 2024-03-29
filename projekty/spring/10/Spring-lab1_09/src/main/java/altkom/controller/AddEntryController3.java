/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altkom.controller;

import altkom.model.Category;
import altkom.model.Entry;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author kursant10
 */
@Controller
@RequestMapping("/addEntryAgain2.do")
public class AddEntryController3 {

    private final static String FORM_VIEW = "addEntryForm3";

    private final static String SUCCESS_VIEW = "home";

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(Model model) {
        model.addAttribute(new Entry());
        model.addAttribute("categories", prepareCategories());

        return FORM_VIEW;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(@ModelAttribute Entry entry) {
        System.out.println("Category = " + entry.getCategory());

        System.out.println("Komputer - wielkosc:" + entry.getKomputer().getWielkosc());
        System.out.println("Komputer - nazwa:" + entry.getKomputer().getNazwa());

         return SUCCESS_VIEW;
    }
    public List prepareCategories() {
		List categories = new ArrayList();
		categories.add( Category.DEFAULT );
		categories.add( Category.CUSTOMER );
		categories.add( Category.BUSINESS_PARTNER );
		categories.add( Category.SERVICE_DELIVERER );
		
		return categories;
    }
}
