package com.backendAssignment.DemoProject.Service;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import com.backendAssignment.DemoProject.Entity.Country;
import com.backendAssignment.DemoProject.Entity.Employee;
import com.backendAssignment.DemoProject.Repository.CountryRepository;
import com.backendAssignment.DemoProject.Repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Serviceimp implements ServiceInterface
{
	//HashMap<String, String> Data = new HashMap<>();
	@Autowired
	EmployeeRepository employee;
	@Autowired
	CountryRepository country;
	
	@Override
	public List<Employee> GetEmpDetails()
	{
		return employee.findAll();
	}
	
	@Override
	public String SetEmpDetails(Employee e)
	{
		employee.save(e);
		return "Added the data";	
	}
	@Override
	public String deleteEmpDetails( int id)
	{
		employee.deleteById(id);
		return "Deleted the data";
	}
	@Override
	public String updateEmployeeDetails(Employee e, int id)
	{
		try {
			Employee temp = employee.findById(id).get();
			if(e.getName()!=null) temp.setName(e.getName());
			
			if(e.getEmailId()!=null) temp.setEmailId(e.getEmailId());
			
			if(Long.toString(e.getMobileNo())!=null) temp.setMobileNo(e.getMobileNo());
			
			if(e.getStatus()!=null) temp.setStatus(e.getStatus());
		
			if(e.getCreatedDate()!=null) temp.setCreatedDate(e.getCreatedDate());
			
			if(e.getCreatedBy()!=null) temp.setCreatedBy(e.getCreatedBy());
			
			if(e.getUpdatedBy()!=null) temp.setUpdatedBy(e.getUpdatedBy());
			
			if(e.getUpdatedDate()!=null) temp.setUpdatedDate(e.getUpdatedDate());
			
			employee.save(temp);
			return "Updated the data";
		}
		catch(NoSuchElementException exp) {	}
		return "Enter the correct Id number";
	}
	
	@Override
	public List<Country> GetCounDetails() 
	{
		return country.findAll();
	}
	
	@Override
	public String SetCounDetails(Country e) 
	{
		country.save(e);
		return "Added the data";
	}
	
	@Override
	public String deleteCounDetails(int id) 
	{
		country.deleteById(id);
		return "Deleted the data";
	}

	@Override
	public String updateCounDetails(Country e, Integer id) 
	{
		Country temp = country.findById(id).get();
		if(e.getCname()!=null) temp.setCname(e.getCname());
		
		country.save(temp);
		return "Updated the data";
	}
}
