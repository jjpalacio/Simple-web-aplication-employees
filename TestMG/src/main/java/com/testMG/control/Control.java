package com.testMG.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.testMG.client.CallRestService;
import com.testMG.model.Employe;
import com.testMG.model.EmployeInad;


@Component
public class Control {
	
public List<EmployeInad> listar() {
		
		new CallRestService();
		Employe[] listaget = CallRestService.callRestService();
		
		new CompleteInformation();
		List<EmployeInad> employeWithSal = new ArrayList<EmployeInad>();
		
		for (int i=0;i<=listaget.length-1; i++) { 
			employeWithSal.add(CompleteInformation.AnualSalary(listaget[i]));			
		}
		return employeWithSal;		
	}
	
	public EmployeInad mostrar(int id) {
		
		new CallRestService();
		Employe[] listaget = CallRestService.callRestService();
		
		new CompleteInformation();
		EmployeInad employeWithSal = new EmployeInad();
		
		for (int i=0;i<=listaget.length-1; i++) { 
			if (listaget[i].getId() == id) {
				employeWithSal = CompleteInformation.AnualSalary(listaget[i]);
				break;
			}
		}
		return employeWithSal;
	}

}
