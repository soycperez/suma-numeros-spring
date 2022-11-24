package com.example.servicios;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class OperacionesImp implements OperacionesService {

	HashMap<String, Double> result = new HashMap<>(); 
	
	@Override
	public HashMap<String, Double> suma(double a, double b) {
		result.put("resultado:", a+b);
		return result;
	}

	@Override
	public HashMap<String, Double> resta(double a, double b) {
		result.put("resultado:", a-b);
		return result;
	}

	@Override
	public HashMap<String, Double> multi(double a, double b) {
		result.put("resultado:", a*b);
		return result;
	}

	@Override
	public HashMap<String, Double> divi(double a, double b) {
		if(b!=0)
			result.put("resultado:", a/b);
		else {
			result.clear();
			result.put("No se puede dividir entre:" , 0.0); 
		}
		return result;
	}
	
}
