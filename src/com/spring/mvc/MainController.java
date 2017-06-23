package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	
	@RequestMapping(value="/showForm.html", method=RequestMethod.GET)
	public ModelAndView getForm() {
		ModelAndView model = new ModelAndView("showForm");
		return model;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("title", "Spring MVC Sample");
		model.addAttribute("welcome", "Welcome to our College");
		model.addAttribute("enter", "Enter your details in the Form below");
	}
	
	@RequestMapping(value="/displayForm.html", method=RequestMethod.POST)
	public ModelAndView displayForm(@RequestParam("name") String name,
			                        @RequestParam("hobby") String hobby) {
		ModelAndView model = new ModelAndView("displayForm");
		Student s = new Student();
		s.setName(name);
		s.setHobby(hobby);
		model.addObject("student", s);
		return model;
	}
}
