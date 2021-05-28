package com.testMG.control;

import org.springframework.stereotype.Component;

import com.testMG.model.Employe;
import com.testMG.model.EmployeInad;

@Component
public class CompleteInformation {
	
	public CompleteInformation() {};

	public static EmployeInad AnualSalary(Employe employe) {
		
		EmployeInad EmpWithAnSalary = new EmployeInad();
		
		EmpWithAnSalary.setId(employe.getId());
		EmpWithAnSalary.setName(employe.getName());
		EmpWithAnSalary.setContractTypeName(employe.getContractTypeName());
		EmpWithAnSalary.setRoleId(employe.getRoleId());
		EmpWithAnSalary.setRoleName(employe.getRoleName());
		EmpWithAnSalary.setRoleDescription(employe.getRoleDescription());
		EmpWithAnSalary.setHourlySalary(employe.getHourlySalary());
		EmpWithAnSalary.setMonthlySalary(employe.getMonthlySalary());
		
		if (employe.getContractTypeName().equals("HourlySalaryEmployee")) {
			EmpWithAnSalary.setAnualSalary(120*employe.getHourlySalary()*12);
		}
		if (employe.getContractTypeName().equals("MonthlySalaryEmployee")) {
			EmpWithAnSalary.setAnualSalary(120*employe.getHourlySalary()*12);
		}
				
		return EmpWithAnSalary;
	}
}
