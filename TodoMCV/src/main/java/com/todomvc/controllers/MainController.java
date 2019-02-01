package com.todomvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value="/index")
	public String init() {
		System.out.println("Retornando index");
		return "index";
	}
	
}
