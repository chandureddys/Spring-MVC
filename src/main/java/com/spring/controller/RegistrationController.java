package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.RegistrationDao;
import com.spring.dto.UserRegistration;
import com.spring.dto.UserRegistrationdto;

@Controller
public class RegistrationController {

	@Autowired
	RegistrationDao registrationDao;

	@RequestMapping("/UserRegistration")
	protected ModelAndView hello() {
		ModelAndView modelandView = new ModelAndView();
		modelandView.setViewName("UserRegistration");
		return modelandView;
	}

	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	protected ModelAndView hello(@ModelAttribute("userRegistration") UserRegistration userRegistration) {
		ModelAndView modelandView = new ModelAndView();

		System.out.println(userRegistration);
		registrationDao.create(userRegistrationdt(userRegistration));
		modelandView.setViewName("Profile");
		modelandView.addObject("userRegistration", userRegistration);
		modelandView.addObject("registrationsuccess", "Welcome to " + userRegistration.getFirstName());
		return modelandView;
	}

	private UserRegistrationdto userRegistrationdt(UserRegistration userRegistration) {

		UserRegistrationdto userRegistrationdto = new UserRegistrationdto();
		userRegistrationdto.setEmail(userRegistration.getEmail());
		userRegistrationdto.setFirstName(userRegistration.getFirstName());
		userRegistrationdto.setLastName(userRegistration.getLastName());
		userRegistrationdto.setPassword(userRegistration.getPassword());
		// userRegistrationdto.setSubscriberid(userRegistration.getSubscriberid());
		System.out.println(userRegistrationdto);
		return userRegistrationdto;

	}

}
