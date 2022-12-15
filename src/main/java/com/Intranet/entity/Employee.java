package com.Intranet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
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
    @Column(name = "department")
    private String department;

    @Column(name = "User_Role")
    private String User_Role;

    @Column(name = "Salary")
    private int Salary;
    @Column(name = "password")
    private String password;

    public Employee() {
        this.first_name = getFirst_name();
        this.last_name = getLast_name();

        // call method asking for department - return department
        this.department = getDepartment();
        this.password = randomPassword(12);
        this.Work_Email = first_name +  "." + last_name + "-" + department + "@PerdonCode.com";
    }
        // generate random password for new employee
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!$@%#^&*";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int randomValue =  (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }
}











