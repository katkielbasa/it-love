package altkom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping( value="/home.do" )
	public String mainMenuHandler() {
	//uderzamy na home.do	
            return "home";
	}

}