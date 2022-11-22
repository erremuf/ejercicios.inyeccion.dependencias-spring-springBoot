package com.rmf.services;

import org.springframework.stereotype.Service;

@Service
public class Persona {
	
	public String datos(String nombre, String apellidos) {
		return "Mi nombre es " + nombre + " " + apellidos + ". ";
	}

}
