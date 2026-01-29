package com.mphasis.firstspringapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mphasis.firstspringapp.model.Contact;

@Repository("contactDAO")
public class ContactDAO {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Contact> findAll() {
		return jdbcTemplate.query("select * from contacts", new BeanPropertyRowMapper<Contact>(Contact.class));
	}
}
