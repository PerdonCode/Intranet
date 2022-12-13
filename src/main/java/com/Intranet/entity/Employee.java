package com.Intranet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmployeeId")
	private int employeeid;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="Work_Email")
	private String email;

	@Column(name="Address")
	private String address;

	@Column(name="PhoneNumber")
	private String phonenumber;

	@Column(name="DepartmentName")
	private String departmentname;

	@Column(name="User_Role")
	private String user_role;

	@Column(name="Salary")
	private int salary;

}











