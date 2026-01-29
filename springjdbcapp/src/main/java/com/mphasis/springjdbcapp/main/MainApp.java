package com.mphasis.springjdbcapp.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.springjdbcapp.config.SpringConfig;
import com.mphasis.springjdbcapp.model.Contact;
import com.mphasis.springjdbcapp.service.ContactService;

public class MainApp {
	
	public static void main(String[] args) {
		read();
		//read("C1");
		//create(new Contact("C4", "Mike", "mike@gmail.com"));
		//delete("C5");
	}
	
	public static void read() {
		AnnotationConfigApplicationContext container =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		ContactService cs = container.getBean("contactService",ContactService.class);
		List<Contact> contacts=cs.getAll();
		for(Contact c : contacts) {
			System.out.println(c.toString());
		}
		container.close();
		container.registerShutdownHook();
	}
	
	public static void read(String id) {
		AnnotationConfigApplicationContext container =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		ContactService cs = container.getBean("contactService",ContactService.class);
		Contact c = cs.getByID(id);
		System.out.println(c.toString());
		container.close();
		container.registerShutdownHook();
	}
	
	public static void create(Contact c) {
		AnnotationConfigApplicationContext container =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		ContactService cs = container.getBean("contactService",ContactService.class);
		Contact contact = cs.save(c);
		System.out.println(contact + "saved...");
		container.close();
		container.registerShutdownHook();
	}
	
	public static void delete(String id) {
		AnnotationConfigApplicationContext container =
				new AnnotationConfigApplicationContext(SpringConfig.class);
		ContactService cs = container.getBean("contactService",ContactService.class);
		Contact contact = cs.deleteByID(id);
		if(contact!=null)
			System.out.println(contact + "deleted...");
		else
			System.out.println("Contact with id "+id + " not found.");
		container.close();
		container.registerShutdownHook();
	}
	
	
}
