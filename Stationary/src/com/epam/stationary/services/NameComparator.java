package com.epam.stationary.services;

import java.util.Comparator;

import com.epam.stationary.domain.StationaryItems;

public class NameComparator implements Comparator<StationaryItems>{
	

	@Override
	public int compare(StationaryItems o1, StationaryItems o2) {
		StationaryItems s1=(StationaryItems)o1;  
		StationaryItems s2=(StationaryItems)o2;  
		  
		return s1.getName().compareTo(s2.getName()); 
	}
}
