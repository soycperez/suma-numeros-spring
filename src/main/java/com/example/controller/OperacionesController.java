package com.example.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicios.OperacionesService;

@RestController
@RequestMapping("operaciones")
public class OperacionesController {

	@Autowired
	OperacionesService operacionesService;

	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<HashMap<String, String>> handleException(Exception e) {
		HashMap<String, String> errores = new HashMap<>();
		errores.put("Error:", e.getMessage());
		return new ResponseEntity<HashMap<String, String>>(errores, HttpStatus.BAD_REQUEST);
	}

	@PostMapping("suma")
	public HashMap<String, Double> sumar(@RequestBody HashMap<String, Double> json) {
		return operacionesService.suma(json.get("a"), json.get("b"));

	}

	@PostMapping("resta")
	public HashMap<String, Double> resta(@RequestBody HashMap<String, Double> json) {
		return operacionesService.resta(json.get("a"), json.get("b"));
	}

	@PostMapping("multi")
	public HashMap<String, Double> multi(@RequestBody HashMap<String, Double> json) {
		return operacionesService.multi(json.get("a"), json.get("b"));
	}

	@PostMapping("divi")
	public HashMap<String, Double> divi(@RequestBody HashMap<String, Double> json) {
		return operacionesService.divi(json.get("a"), json.get("b"));
	}

}
