package com.Intranet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    // define fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeId")
    private int employeeid;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Work_Email")
    private String Work_Email;

    @Column(name = "Address")
    private String address;

    @Column(name = "PhoneNumber")
    private String PhoneNumber;

    @Column(name = "DepartmentName")
    private String DepartmentName;

    @Column(name = "User_Role")
    private String User_Role;

    @Column(name = "Salary")
    private int Salary;

}











