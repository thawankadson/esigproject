package com.educandoweb.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Controler {
	@GetMapping
	public ModelAndView index() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("home/index");
		return mv;
		
	}
	

}
