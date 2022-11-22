package com.rmf.services;

import org.springframework.stereotype.Service;

@Service
public class CochesServiceImpl implements ICochesService{

	@Override
	public int calculaITV(int cv, int anios) {
		if(cv >= 120 && anios>5) {
			return 1;
		}
		return 2;
	}

	@Override
	public int calculaRevision(int cv) {
		if(cv >= 100) {
			return 100;
		}
		return 50;
	}

}
