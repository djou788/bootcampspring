package com.edinfo.shipping.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping ("/info")
	public String info()
	{
	return "home/info";
	}
	
	@RequestMapping ("/affichage")
	public String affichage(Model model)
	{
		String formation="Fulstack";
		System.out.println("Méthode info");
		model.addAttribute("workshop",formation);
		
	return "home/affichage";
	}
}
