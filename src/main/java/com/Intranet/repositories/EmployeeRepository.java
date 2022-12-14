package com.Intranet.repositories;

import com.Intranet.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByOrderByDepartmentAsc();

    public List<Employee> findByFnameContainingIgnoreCase(String name);
}

