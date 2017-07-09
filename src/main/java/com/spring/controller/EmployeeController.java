package com.spring.controller;

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
		modelandView.setViewName("employeeInfo");
		modelandView.addObject("employee", employee);
		
		
		
		return modelandView;
		
		
	}

}
