package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.ProductDao;
import com.spring.dao.RegistrationDao;
import com.spring.dto.Product;
import com.spring.dto.ProductDto;
import com.spring.dto.UserRegistrationdto;

@Controller
public class ProductController {

	@Autowired
	ProductDao productDao;
	@Autowired
	RegistrationDao registrationDao;
	Integer id;

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	protected ModelAndView products(@ModelAttribute("product") Product product, HttpSession session) {
		ModelAndView modelandView = new ModelAndView();

		String fname = (String) session.getAttribute("firstName");

		product.setFirstName(fname);
		List<UserRegistrationdto> userrRegistrationdto = registrationDao.userRegistrationdto(product.getFirstName());
		for (UserRegistrationdto e : userrRegistrationdto) {
			id = e.getId();
		}

		productDao.create(productDt(product, id));
		modelandView.setViewName("DisplayProducts");
		modelandView.addObject("userRegistration", product);
		modelandView.addObject("registrationsuccess", "Welcome to " + product.getProductName());
		return modelandView;
	}

	private ProductDto productDt(Product product, int id) {

		ProductDto productDto = new ProductDto();

		productDto.setCategory(product.getCategory());
		productDto.setId(id);
		productDto.setProductName(product.getProductName());
		productDto.setPrice(product.getPrice());
		productDto.setProductDescription(product.getProductDescription());
		return productDto;

	}

}
