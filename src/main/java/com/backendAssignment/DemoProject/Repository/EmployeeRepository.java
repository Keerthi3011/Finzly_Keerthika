package com.backendAssignment.DemoProject.Repository;

import java.util.List;

import com.backendAssignment.DemoProject.Entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	 
	//  @Query("update Employee set email = ?1 where id =?2")
	//  public List<Employee> updateEmployeeDetails(String email, int id);
	 
}
