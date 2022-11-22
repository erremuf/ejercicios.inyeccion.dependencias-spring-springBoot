package com.rmf.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("empleados")
//@Primary
public class EmpleadosServiceImpl implements IEmpresasService{

	@Override
	public String departamento() {
		System.out.println("Lanzando método DEPARTAMENTO de la clase EMPLEADOS");
		return "En cada departamento somos: ";
	}

	@Override
	public int numEmpleados() {
		System.out.println("Lanzando método NUMEMPLEADOS de la clase EMPLEADOS");
		return 7;
	}

}
