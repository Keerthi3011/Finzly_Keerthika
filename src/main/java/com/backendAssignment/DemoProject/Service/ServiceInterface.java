package com.backendAssignment.DemoProject.Service;

import java.util.List;

import com.backendAssignment.DemoProject.Entity.Country;
import com.backendAssignment.DemoProject.Entity.Employee;

public interface ServiceInterface 
{
	public List<Employee> GetEmpDetails();
	public String SetEmpDetails(Employee e);
	public String deleteEmpDetails( int id);
	public String updateEmployeeDetails(Employee e, int id);
	
	public List<Country> GetCounDetails();
	public String SetCounDetails(Country e);
	public String deleteCounDetails(int id);
	public String updateCounDetails(Country e, Integer id);
}
