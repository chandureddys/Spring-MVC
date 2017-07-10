package com.spring.dao;


import java.util.List;

import com.spring.dto.UserRegistrationdto;

public interface RegistrationDao {

	int create(UserRegistrationdto userRegistrationdto);
	
	List<UserRegistrationdto> userRegistrationdto(String fname);



}
