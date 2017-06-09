package com.epam.stationary.util;

import java.util.Comparator;

import com.epam.stationary.model.StationaryItems;

public class PriceComparator implements Comparator<StationaryItems>{

	@Override
	public int compare(StationaryItems o1, StationaryItems o2) {
		StationaryItems s1=(StationaryItems)o1;  
		StationaryItems s2=(StationaryItems)o2;  
		  
		if(s1.getPrice()==s2.getPrice())  
			return 0;  
			else if(s1.getPrice()>s2.getPrice())  
			return 1;  
			else  
			return -1;  
	}
	
	
	
}
