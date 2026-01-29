package com.mphasis.firstspringapp.main;


import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mphasis.firstspringapp.dao.ContactDAO;
import com.mphasis.firstspringapp.model.Contact;


public class MainJDBC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext container =
				new ClassPathXmlApplicationContext("spring-config.xml");

		ContactDAO contactDAO = container.getBean("contactDAO",ContactDAO.class);
		List<Contact> contacts = contactDAO.findAll();
		for(Contact c : contacts) {
			System.out.println(c.getId()+","+c.getName()+","+c.getEmail());
		}
		container.close();
		container.registerShutdownHook();
	}
}
