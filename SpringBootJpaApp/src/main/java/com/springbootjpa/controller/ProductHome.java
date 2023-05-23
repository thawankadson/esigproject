package com.springbootjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductHome {
	@GetMapping(value="/")
	public String homePage() {
		return "index";
		
	}

}
