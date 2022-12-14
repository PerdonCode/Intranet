package com.Intranet.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {

    // define fields
    private int defaultPasswordLength = 12;
    private String companySuffix = "@PerdonCode.com";


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public Employee(String firstName, String lastName) {
        this.first_name = firstName;
        this.last_name = lastName;

        // call method asking for department - return department
        this.department_name = department_name;
        this.password = randomPassword(defaultPasswordLength);
        this.Work_Email = firstName.toLowerCase() +  "." + lastName.toLowerCase() + "-" + department_name + "@" + companySuffix;
    }

    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!$@%#^&*";
        char[] password = new char[length];
        for (int i = 0; i<length; i++){
            int randomValue =  (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }
    public void changePassword(String password){
        this.password = password;
    }

}











