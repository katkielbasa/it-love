package altkom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping( value="/home.do" ) // nas³uchuje na /home.do
	public String mainMenuHandler() {   // podaje ile razy cos jest wystukane na serwerze
		return "home";
	}

}
