package com.ems.employeeManagementSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value={"/", "home", "index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("hello", "welcome to Employee management system");
		return mv;
	}
}
