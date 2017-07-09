package com.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.RegistrationDao;
import com.spring.dto.UserRegistration;
import com.spring.dto.UserRegistrationdto;

@Service
@Repository("registrationDao")
public class RegistrationDaoImpl implements RegistrationDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(UserRegistrationdto userRegistrationdto) {
		// TODO Auto-generated method stub
		System.out.println(userRegistrationdto);
		System.out.println(hibernateTemplate.hashCode());

		Integer result = (Integer) hibernateTemplate.save(userRegistrationdto);

		return result;
	}

}
