package org.generation.italy.controller;

import org.generation.italy.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@Autowired
	private DepartmentRepository repository;
	
	@GetMapping
	public String Departments(Model model) {
		model.addAttribute("departments",repository.findAll());
		return "template_departments";
	}
	
}
