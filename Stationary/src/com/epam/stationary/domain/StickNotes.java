package com.epam.stationary.domain;

public class StickNotes implements StarterKit,Comparable<StickNotes>{
	 private String name;
	 
	 private int price;

	 public StickNotes(String name, int price) {
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
	@Override
	public int compareTo(StickNotes o) {
		return (int) (this.price - o.price);
	}

	public String toString() {
	    return "[name=" + this.name + ", price=" + this.price + "]";
	}
}
