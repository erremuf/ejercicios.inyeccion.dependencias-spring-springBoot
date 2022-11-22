package com.rmf.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("departamentos")
@Primary
public class DepartamentosServiceImpl implements IEmpresasService{

	@Override
	public String departamento() {
		System.out.println("Lanzando método DEPARTAMENTO de la clase DEPARTAMENTOS");
		return "En la empresa hay 3 departamentos: Diseño, Desarrollo y Ventas. Actualmente somos un total de ";
	}

	@Override
	public int numEmpleados() {
		System.out.println("Lanzando método NUMEMPLEADOS de la clase DEPARTAMENTOS");
		return 21;
	}
	
	

}
