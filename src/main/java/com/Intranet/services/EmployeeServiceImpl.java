package com.Intranet.services;

import com.Intranet.entity.Employee;
import com.Intranet.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByDepartmentAsc();
    }

    @Override
    public Employee findById(int employee_id) {
        Optional<Employee> result = employeeRepository.findById(employee_id);

        Employee theEmployee = null;

        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + employee_id);
        }

        return theEmployee;
    }

    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int employee_id) {
        employeeRepository.deleteById(employee_id);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByFnameContainingIgnoreCase(name);
    }

}






