package com.Intranet.repositories;

import com.Intranet.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

public List<Employee> findAllByOrderByDepartmentAsc();

    @Query(value = "select * from employee e where e.first_name like %:keyword% or e.last_name like %:keyword% or e.User_Role like %:keyword%", nativeQuery = true)
    List<Employee> findByKeyword(@Param("keyword") String keyword);
}

