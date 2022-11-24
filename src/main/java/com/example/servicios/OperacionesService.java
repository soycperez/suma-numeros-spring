package com.example.servicios;

import java.util.HashMap;

public interface OperacionesService {
	
	public HashMap<String, Double> suma(double a, double b);
	public HashMap<String, Double> resta(double a, double b);
	public HashMap<String, Double> multi(double a, double b);
	public HashMap<String, Double> divi(double a, double b);
	

}
