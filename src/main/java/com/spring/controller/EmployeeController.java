package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dto.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/employee")
	public ModelAndView employee(){
		
		ModelAndView modelandView = new ModelAndView();
		
		Employee employee = new Employee();
		
		employee.setId(12);
		employee.setName("Chandrasekhar");
		employee.setPosition("Software Engineer");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("sekhar");
		employee1.setPosition("Engineer");
		
		Employee employee2 = new Employee();
		employee2.setId(3);
		employee2.setName("Reddy");
		employee2.setPosition("SDE");
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(employee);
		employees.add(employee1);
		employees.add(employee2);
		
		
		modelandView.setViewName("employeeInfo");
		modelandView.addObject("employees", employees);
		
		return modelandView;
		
		
	}

}
