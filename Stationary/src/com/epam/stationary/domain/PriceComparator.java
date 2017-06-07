package com.epam.stationary.domain;

import java.util.Comparator;

public class PriceComparator implements Comparator<StarterKit>{

	@Override
	public int compare(StarterKit o1, StarterKit o2) {
		StarterKit s1=(StarterKit)o1;  
		StarterKit s2=(StarterKit)o2;  
		  
		if(s1.getPrice()==s2.getPrice())  
			return 0;  
			else if(s1.getPrice()>s2.getPrice())  
			return 1;  
			else  
			return -1;  
	}
	
	
	
}
