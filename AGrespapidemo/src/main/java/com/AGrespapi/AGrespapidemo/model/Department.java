package com.AGrespapi.AGrespapidemo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Department")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Department {

	
	@OneToMany(cascade= CascadeType.ALL, mappedBy = "department")
	@JsonIgnore private List<Employee> employee;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDepartment;
	
	@Column(name="DepartmentName")
	private String departmentName;

	public Department() {
		
	}
	
	public Department(String departmentName) {
		
		this.departmentName = departmentName;
	}



	/*
	 * public List<Employee> getEmployee() { return employee; }
	 * 
	 * public void setEmployee(List<Employee> employee) { this.employee = employee;
	 * }
	 */
	 

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	

	
}
