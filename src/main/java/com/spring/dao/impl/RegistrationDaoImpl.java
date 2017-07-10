package com.spring.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.RegistrationDao;
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
	
		Integer result = (Integer) hibernateTemplate.save(userRegistrationdto);

		return result;
	}

	@Override
	@Transactional
	public List<UserRegistrationdto> userRegistrationdto(String fname) {
		// TODO Auto-generated method stub

		UserRegistrationdto udto = new UserRegistrationdto();
		udto.setFirstName(fname);
		List<UserRegistrationdto> userRegistrationdto = (List<UserRegistrationdto>) hibernateTemplate
				.findByCriteria(DetachedCriteria.forClass(UserRegistrationdto.class).add(Example.create(udto)));
		return userRegistrationdto;

	}

}
