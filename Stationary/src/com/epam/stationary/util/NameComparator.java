package com.epam.stationary.util;

import java.util.Comparator;

import com.epam.stationary.model.StationaryItems;

public class NameComparator implements Comparator<StationaryItems>{
	

	@Override
	public int compare(StationaryItems o1, StationaryItems o2) {
		StationaryItems s1=(StationaryItems)o1;  
		StationaryItems s2=(StationaryItems)o2;  
		  
		return s1.getName().compareTo(s2.getName()); 
	}
}
