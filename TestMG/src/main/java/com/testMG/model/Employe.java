package com.testMG.model;

public class Employe {
	
	private int id;
	private String name;
    private String contractTypeName;
    private int roleId;
    private String roleName;
    private String roleDescription;
    private int hourlySalary;
    private int monthlySalary;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContractTypeName() {
		return contractTypeName;
	}
	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public int getHourlySalary() {
		return hourlySalary;
	}
	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}
	public int getMonthlySalary() {
		return monthlySalary;
	}
	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}