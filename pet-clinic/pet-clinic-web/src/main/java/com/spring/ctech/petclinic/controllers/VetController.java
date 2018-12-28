package com.spring.ctech.petclinic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ctech.petclinic.service.VetService;

@RequestMapping("/vets")
@Controller
public class VetController {

	@Autowired
	VetService vetService;
	
	@RequestMapping({"", "/","/index","/index.html"})
	public String listVets(Model model) {
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	}
}
