package com.Intranet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "employee_id")
    private int employee_id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Age")
    private String Age;

    @Column(name = "Work_Email")
    private String Work_Email;

    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "department_name")
    private String department_name;

    @Column(name = "User_Role")
    private String User_Role;

    @Column(name = "Salary")
    private int Salary;
    @Column(name = "password")
    private String password;
}











