package com.Intranet.classes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Employee {
    private int employeeid;
    private String firstname;
    private String lastname;
    private String work_email;
    private String address;
    private String phonenumber;
    private String departmentname;
    private String user_role;
    private int salary;
}
