package com.epam.stationary.model;

public class File implements StationaryItems{
 private String name;
 
 private int price;

 public File(String name, int price) {
     this.name = name;
     this.price = price;
   
 }
 
public String getName() {
	return name;
}


public int getPrice() {
	return price;
} 
}
