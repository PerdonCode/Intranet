package com.Intranet.services;


import com.Intranet.entity.Employee;

import java.util.List;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int employee_id);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int employee_id);

	List<Employee> findByName(String name);
}
