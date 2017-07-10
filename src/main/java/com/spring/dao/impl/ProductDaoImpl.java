package com.spring.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.ProductDao;

import com.spring.dto.ProductDto;

@Service
@Repository("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Override
	@Transactional
	public int create(ProductDto productdto) {
		// TODO Auto-generated method stub
		Integer result = (Integer) hibernateTemplate.save(productdto);
		return result;
	}

}
