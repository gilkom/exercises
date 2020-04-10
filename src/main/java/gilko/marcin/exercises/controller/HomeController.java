package gilko.marcin.exercises.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("welcome", "Cwiczenia z javy i springa!");
		model.addAttribute("tagline", "zmienne");
		model.addAttribute("zmienna", "blabla");
		
		return "welcome";
	}

}
