package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dto.UserRegistration;

@Controller
public class RegistrationController {
	
	@RequestMapping("/UserRegistration")
	protected ModelAndView hello(){
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("UserRegistration");
		return modelandView;
	}
	
	@RequestMapping(value="/registration",method = RequestMethod.POST)
	protected ModelAndView hello(@ModelAttribute("userRegistration") UserRegistration userRegistration){
		ModelAndView modelandView = new ModelAndView();
		System.out.println(userRegistration);
		modelandView.setViewName("Profile");
		modelandView.addObject("userRegistration",userRegistration);
		modelandView.addObject("registrationsuccess", "Welcome to "+ userRegistration.getUsername());
		return modelandView;
	}

}
