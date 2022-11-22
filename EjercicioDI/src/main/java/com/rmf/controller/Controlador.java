package com.rmf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rmf.services.Animal;
import com.rmf.services.Persona;


@Controller
public class Controlador {
	
@Autowired
Persona persona;
@Autowired
Animal animal;
	
@GetMapping("/index")
public String info(Model modelo) {
	modelo.addAttribute("mensaje", persona.datos("Jorge", "Galaup") + animal.datos("Tula", "Buldog"));
	return "index";
}

}
