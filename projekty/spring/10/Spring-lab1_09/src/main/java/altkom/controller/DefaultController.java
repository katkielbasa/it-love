package altkom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
	
	@RequestMapping( value="/home.do" ) // jak na to natrafi przegladarka to sie odpali metdoa mainMenyHandler
	public String mainMenuHandler() {
		return "home";
	}

}
