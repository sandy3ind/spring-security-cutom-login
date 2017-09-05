package com.javagain.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 
 * @author Sandeep.Sharma
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String  login(@RequestParam(value = "error", required = false) String error,
			Model model) {
		if (error != null) {
			model.addAttribute("error", "Invalid username and password!");
		}
		return "login";
	}

	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String  userPage(Model model) {
		// Set attribute on model
		model.addAttribute("title", "Spring Security Home page");
		model.addAttribute("message", "This is protected page!");
		// Return view name
		return "home";
	}
}
