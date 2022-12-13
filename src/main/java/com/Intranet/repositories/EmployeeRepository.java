package com.Intranet.repositories;

import com.Intranet.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

// no code needed
	
}
