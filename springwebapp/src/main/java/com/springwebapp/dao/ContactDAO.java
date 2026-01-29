package com.springwebapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springwebapp.model.Contact;

@Repository("contactDAO")
public class ContactDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Contact> findAll(){
		String sql="select * from contacts";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Contact>(Contact.class));
	}
	
	public Contact save(Contact c){
		String sql="insert into contacts(id,name,email) values(?,?,?)";
		Object params[] = {c.getId(),c.getName(),c.getEmail()};
		int n = jdbcTemplate.update(sql,params);
		if(n>0) {
			return c;
		}
		else
			return null;
	}
	
	public Contact delete(String id){
		String sql="delete from contacts where id=?";
		Contact c =findById(id);
		int n = jdbcTemplate.update(sql,id);
		if(n>0) {
			return c;
		}
		else
			return null;
	}
	
	public Contact findById(String id) {
		String sql="select * from contacts where id=?";
		Object param[] = {id};
		
		return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Contact>(Contact.class),param);
	}
	
}
