package com.rmf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.rmf.services.IEmpresasService;

@Controller
public class IndexController {
	
	
	
//////////////////////////////////////////////////////////////// INYECCIÓN CON INTERFAZ ////////////////////////////////////////////////////////////////
	/*
	 * @Autowired private IEmpresasService iEmpresasService;
	 * 
	 * @GetMapping("/index") public String index(Model modelo) {
	 * System.out.println("Lanzando métodos de interfaz IEmpresasService");
	 * modelo.addAttribute("mensaje", iEmpresasService.departamento() +
	 * IEmpresasService.numEmpleados()); return "index"; }
	 */
	
	
	
//////////////////////////////////////////////////////////////// INYECCIÓN DE INTERFAZ CON CONSTRUCTOR ////////////////////////////////////////////////////////////////
	/*
	 * private IEmpresasService iEmpresasService;
	 * 
	 * @Autowired public IndexController(IEmpresasService iEmpresasService) {
	 * this.iEmpresasService = iEmpresasService; }
	 * 
	 * @GetMapping("/index") public String index(Model modelo) {
	 * System.out.println("Lanzando métodos de interfaz con constructor");
	 * modelo.addAttribute("mensaje", iEmpresasService.departamento() +
	 * iEmpresasService.numEmpleados()); return "index"; }
	 */

	
	
////////////////////////////////////////////////////////////////INYECCIÓN DE INTERFAZ CON MÉTODO SETTER ////////////////////////////////////////////////////////////////
	private IEmpresasService iEmpresasService;
	
	@Autowired
	public void setiEmpresasService(IEmpresasService iEmpresasService) {
		this.iEmpresasService = iEmpresasService;
	}
	
	@GetMapping("/index")
	public String index(Model modelo) {
		System.out.println("Lanzando métodos de interfaz con setter");
		modelo.addAttribute("mensaje", iEmpresasService.departamento() + iEmpresasService.numEmpleados()); return "index";
	}
	
	
}
