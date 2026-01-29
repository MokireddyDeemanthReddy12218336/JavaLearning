package com.springwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springwebapp.model.Contact;
import com.springwebapp.service.ContactService;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/contactslist")
	public String getContacts(Model model) {
		model.addAttribute("contacts", contactService.getAll());
		return "contactslistpage";
	}
	
	@GetMapping("/addcontact")
	public String addcontact() {
		return "addcontactpage";
	}

	
	@PostMapping("/savecontact")
	public String addContact(@RequestParam("id") String id , 
			@RequestParam("name") String name ,@RequestParam("email") String email,
			Model model) {
		Contact contact = new Contact(id,name,email);
		contactService.save(contact);
//		model.addAttribute("contacts", contactService.getAll());
		return "redirect:/contactslist";
	}
	
	@PostMapping("/deleteid")
	public String deleteId(@RequestParam("id")String id) {
		contactService.deleteByID(id);
		return "redirect:/contactslist";
	}
}
