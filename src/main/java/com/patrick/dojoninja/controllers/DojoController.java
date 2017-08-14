package com.patrick.dojoninja.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.patrick.dojoninja.models.*;
import com.patrick.dojoninja.services.*;

@Controller
public class DojoController {
	private final DojoService service;
	
	public DojoController(DojoService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/dojos/new";
	}
	
	@RequestMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newdojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String addDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "newninja.jsp";
		}
		else {
			service.addDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
}
