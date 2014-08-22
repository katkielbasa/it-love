package altkom.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import altkom.model.EntryCategory;
import altkom.model.Entry;
import altkom.model.PhoneType;
import altkom.model.repository.PhoneBookRepository;
import altkom.model.util.validation.EntryValidator;

@Controller
@RequestMapping( "/addEntry3.do" )
public class AddEntryController3 {

	private final static String FORM_VIEW = "addEntryForm3";
	
	private final static String SUCCESS_VIEW = "home";
	
	@Autowired
	private PhoneBookRepository phoneBookRepository;
	
	@RequestMapping( method = RequestMethod.GET )
	public String setupForm( Model model ) {
            
		model.addAttribute( new Entry() );
		model.addAttribute( "categories", prepareCategories() );
		model.addAttribute( "phoneTypes", preparePhoneTypes() );
		
		return FORM_VIEW;
	}
	
	@RequestMapping( method = RequestMethod.POST )
	public String submitForm( @ModelAttribute Entry entry, Errors errors, Model model ) {
		/*
		new EntryValidator().validate( entry, errors );
		
		if ( errors.hasErrors() ) {
			model.addAttribute( "categories", prepareCategories() );
			model.addAttribute( "phoneTypes", preparePhoneTypes() );
			return FORM_VIEW;
		}
		*/
		 phoneBookRepository.save( entry );
		 phoneBookRepository.logToSysout();
		
            System.out.println("komputer nazwa : "+ entry.getKomputer().getNazwa());
             System.out.println("komputer opis: "+ entry.getKomputer().getOpis());
		return SUCCESS_VIEW;
	}
	
	public List prepareCategories() {
		List categories = new ArrayList();
		categories.add( EntryCategory.DEFAULT );
		categories.add( EntryCategory.CUSTOMER );
		categories.add( EntryCategory.BUSINESS_PARTNER );
		categories.add( EntryCategory.SERVICE_DELIVERER );
		
		return categories;
	}
	
	public List preparePhoneTypes() {
		List phoneTypes = new ArrayList();
		phoneTypes.add( PhoneType.PUBLIC );
		phoneTypes.add( PhoneType.PRIVATE );
		phoneTypes.add( PhoneType.MOBILE );
		phoneTypes.add( PhoneType.HOME );
		
		return phoneTypes;
	}
	
}
