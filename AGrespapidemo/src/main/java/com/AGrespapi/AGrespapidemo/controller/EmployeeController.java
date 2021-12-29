package com.AGrespapi.AGrespapidemo.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.AGrespapi.AGrespapidemo.model.Employee;
import com.AGrespapi.AGrespapidemo.repository.EmployeeRepository;


@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:8080")
public class EmployeeController {

	@Autowired
	EmployeeRepository employeeRepository;
	
	Logger logger = LoggerFactory.getLogger(getClass());
	
	@GetMapping
	public String tester() {
		return "welcome";
	}
	

	@GetMapping("/employeeList")
	public Iterable<Employee> findAllemployees(){
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{Id}") 
	public Optional<Employee> findEmployeeById(@PathVariable
	int Id) { return employeeRepository.findById(Id); }
	  
	@PostMapping("/addEmployee") 
	public Employee addEmployee(@RequestBody
	Employee employee) { return employeeRepository.save(employee); }
	  
	  
		
  @PutMapping("/updateEmployee/{Id}") 
  public void updateEmployee(@RequestBody
  Employee employee, @PathVariable int Id){
  Employee emp = employeeRepository.findById(Id).orElse(null) ;
  emp.setFirst_name(employee.getFirst_name());
  emp.setLast_name(employee.getLast_name());
  emp.setDepartment(employee.getDepartment());
  emp.setDob(employee.getDob());
  emp.setExperience(employee.getExperience());
  emp.setHighest_edu_level(employee.getHighest_edu_level());
  emp.setPosition(employee.getPosition());
  emp.setSalary(employee.getSalary());
  emp.setSupervisory_role(employee.getSupervisory_role());
  logger.info("{} {}", emp, emp.getId());
  
  employeeRepository.save(emp);
		
	  }
	  	
	  @DeleteMapping("/deleteRecord/{Id}") 
	  public void deleteEmployeeById(@PathVariable int Id) {
	  employeeRepository.deleteById(Id); }
	 	  
}


