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

@Controller
@RequestMapping( "/addEntry.do" )//nasluchuje na addEntry.do
public class AddEntryController{

    private final static String FORM_VIEW = "addEntryForm";
	
	private final static String SUCCESS_VIEW = "home";
    
        @Resource( name="inMemoryRepository" )
	private PhoneBookRepository phoneBookRepository;
	
	@RequestMapping( method = RequestMethod.GET )
	public String setupForm( Model model ) {
		model.addAttribute( new Entry() );
		model.addAttribute( "categories", prepareCategories() );
		
		return FORM_VIEW;
	}
	
	@RequestMapping( method = RequestMethod.POST )
	public String submitForm( @ModelAttribute Entry entry ) {
	
System.out.println( "Category = " + entry.getCategory() );
System.out.println("person-name:"+ entry.getPerson().getName());
        System.out.println("person-surname:"+ entry.getPerson().getSurname());
		phoneBookRepository.save( entry );
		phoneBookRepository.logToSysout();

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