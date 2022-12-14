package com.Intranet.controllers;

import com.Intranet.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

   private List<Employee> theEmployees;

   @PostConstruct
   private void loadData() {
       // create employees
       Employee emp1 = new Employee(1, "Niels", "Perdon", "Niels.Perdon@PerdonCode.com", "Dirkboutslaan 18", "0644458175", "CEO", "CEO", 8000);
       Employee emp2 = new Employee(1, "Lisa", "Brinkhorst", "Lisa.brinkhorst@PerdonCode.com", "Dirkboutslaan 18", "0644458175", "CEO", "CEO", 8000);
       Employee emp3 = new Employee(1, "Niels", "Perdon", "Niels.Perdon@PerdonCode.com", "Dirkboutslaan 18", "0644458175", "CEO", "CEO", 8000);

       // create the list
       theEmployees = new ArrayList<>();

       // add to the list
       theEmployees.add(emp1);
       theEmployees.add(emp2);
       theEmployees.add(emp3);
    }
    @GetMapping("/lists")
    public String listEmployees(Model theModel){
       // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}
