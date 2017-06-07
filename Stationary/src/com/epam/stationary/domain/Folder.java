package com.epam.stationary.domain;

public class Folder implements StarterKit{
	 private String name;
	 
	 private int price;

	 public Folder(String name, int price) {
	     this.name = name;
	     this.price = price;
	   
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
	
	
}
