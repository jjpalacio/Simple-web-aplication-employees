package com.testMG.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testMG.control.Control;
import com.testMG.model.EmployeInad;
;

@RestController
@RequestMapping("employees")
public class EmployeRest {
	
	@Autowired
	private Control control;
	
	@GetMapping("/list")
	public List<EmployeInad> listar(){
		return control.listar();
	} 
	
	@GetMapping("/list/{Id}")
	public EmployeInad ViewbyId(@PathVariable("Id") Integer Id){
		return control.mostrar(Id);
	}

}
