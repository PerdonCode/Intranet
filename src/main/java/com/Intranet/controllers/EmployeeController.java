package com.Intranet.controllers;

import com.Intranet.entity.Employee;
import com.Intranet.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        // get employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showFormForAddEmployee")
    public String showFormForAddEmployee(Model theModel) {

        // create model attribute to bind form data
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        List<String> listDepartment = List.of("HR", "SUPPORT", "MAGAZIJN", "FINANCE", "IT", "MARKETING");
        theModel.addAttribute("listDepartment", listDepartment);

        // get the data from the chosen listDepartment
        List<String> ListUser_Role = List.of("HR", "MANAGER_HR", "SUPPORT", "MANAGER_SUPPORT", "MAGAZIJN", "MANAGER_MAGAZIJN", "FINANCE", "MANAGER_FINANCE", "IT", "MANAGER_IT", "MARKETING", "MANAGER_MARKETING");

        theModel.addAttribute("ListUser_Role", ListUser_Role);

        return "employees/employee-form";
    }


    @GetMapping("/showFormForUpdateEmployee")
    public String showFormForUpdate(@RequestParam() int employeeId, Model theModel) {
        // get the employee from the service
        Employee theEmployee = employeeService.findById(employeeId);

        // set employee as a model attribute to pre-populate form
        theModel.addAttribute("employee", theEmployee);

        // send over to our form
        return "employees/employee-form";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        // save employee
        employeeService.save(theEmployee);

        // use redirect to prevent duplicate submissions
        return "redirect:/employees/list";
    }

    @PostMapping("/delete")
    public String deleteEmployee(@ModelAttribute("employee") int employeeId) {
        // save employee
        employeeService.deleteById(employeeId);

        // use redirect to prevent duplicate submissions
        return "employees/list";
    }

    @GetMapping("/search")
    public String search(String keyword, Model theModel) {
        if (keyword != null) {
            List<Employee> list = employeeService.getByKeyword(keyword);
            theModel.addAttribute("list", list);
        } else {
            List<Employee> list = employeeService.findAll();
            theModel.addAttribute("list", list);
        }
        return "employees/list-employees";
    }
}


