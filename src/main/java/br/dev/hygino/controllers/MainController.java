package br.dev.hygino.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/admin")
	public String getHomepage() {
		return "admin/home";
	}
}
