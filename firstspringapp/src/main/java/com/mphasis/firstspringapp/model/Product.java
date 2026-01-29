package com.mphasis.firstspringapp.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String id;
	private String name;
	private int price;
	private List<String>  colorVariants = new ArrayList<String>();
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<String> getColorVariants() {
		return colorVariants;
	}

	public void setColorVariants(List<String> colorVariants) {
		this.colorVariants = colorVariants;
	}
	
	
	
	
}
