package altkom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping( value="/home.do" )//nasluchije na home.do
	public String mainMenuHandler() {//zapisuje sie ile razy uderzamy na home.dom w przegladarce
		return "home";
	}

}
