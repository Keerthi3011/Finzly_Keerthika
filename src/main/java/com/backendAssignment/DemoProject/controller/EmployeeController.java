package com.backendAssignment.DemoProject.controller;

import java.util.List;

import com.backendAssignment.DemoProject.Entity.Country;
import com.backendAssignment.DemoProject.Entity.Employee;
import com.backendAssignment.DemoProject.Service.Serviceimp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeController 
{
	@Autowired
	Serviceimp service;
	
	@GetMapping("getEmp")
	public Employee getData()
	{
		return new Employee();
	}
	
	@GetMapping("/getAllEmployee")
	public List<Employee> GetEmployeeDetails()
	{
		return service.GetEmpDetails();
	}
		
	@PostMapping("SetEmployeeDetails")
	public String SetEmployeeDetails(@RequestBody Employee e)
	{
		return service.SetEmpDetails(e);	
	}
	
	@DeleteMapping("deleteDetails/{id}")
	public String deleteEmployeeDetails(@PathVariable(value ="id") int id)
	{
		return service.deleteEmpDetails(id);
	}
	
	@PutMapping("updateDetails/{id}")
	public String updateEmpDetails(@RequestBody Employee e, @PathVariable Integer id)
	{
		return service.updateEmployeeDetails(e,id);
		
	}
	
	@GetMapping("getCountry")
	public Country getData1()
	{
		return new Country();
	}
	
	@GetMapping("/getAllCountry")
	public List<Country> GetCountryDetails()
	{
		return service.GetCounDetails();
	}
		
	@PostMapping("SetCountryDetails")
	public String SetCountryDetails(@RequestBody Country e)
	{
		return service.SetCounDetails(e);	
	}
	
	@DeleteMapping("deleteCountryDetails/{id}")
	public String deleteCountryDetails(@PathVariable(value ="id") int id)
	{
		return service.deleteCounDetails(id);
	}
	
	@PutMapping("updateCountryDetails/{id}")
	public String updateCountryDetails(@RequestBody Country e, @PathVariable Integer id)
	{
		return service.updateCounDetails(e,id);
		
	}
}
