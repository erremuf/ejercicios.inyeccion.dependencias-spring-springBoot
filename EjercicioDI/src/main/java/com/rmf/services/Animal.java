package com.rmf.services;

import org.springframework.stereotype.Service;

@Service
public class Animal {
	
	public String datos(String nombre, String raza) {
		return "Tengo un " + raza + " que se llama " + nombre + ".";
	}

}
