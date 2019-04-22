package com.rm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloworldController {
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView hello(){
		
		return new ModelAndView("welcome", "viewMessage", "Hello this is my "
				+ "first Spring dispatcher Servlet");  //Jsp file name must match view name (welcome)
		
	}

}
