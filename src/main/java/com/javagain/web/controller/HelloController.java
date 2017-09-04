package com.javagain.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author Sandeep.Sharma
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String  showLogin() {		
		return "login";
	}

	/**
	 * Show User page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public String  userPage(Model model) {
		// Set attribute on model
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is not protected page - User Page!");
		// Return view name
		return "user";
	}
	
	/**
	 * Show DBA page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "dba", method = RequestMethod.GET)
	public String  dbPage(Model model) {
		// Set attribute on model
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is protected page - DBA Page!");
		// Return view name
		return "dba";
	}
	
	/**
	 * Show Admin page
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "admin", method = RequestMethod.GET)
	public String  adminPage(Model model) {
		// Set attribute on model
		model.addAttribute("title", "Spring Security Hello World");
		model.addAttribute("message", "This is protected page - Admin Page!");
		// Return view name
		return "admin";
	}
}
