package com.rmf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rmf.services.ICochesService;


@Controller
public class Controlador {
	
	@Autowired
	private ICochesService iCochesService;
	
	@GetMapping("/index")
	public String index(Model modelo) {
		modelo.addAttribute("mensaje", "Debes pasar la ITV cada " + iCochesService.calculaITV(120, 6) + " años y la revisión anual le costará " + iCochesService.calculaRevision(150) + "€.");
		return "index";
	}
	

}
