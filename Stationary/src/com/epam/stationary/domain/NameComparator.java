package com.epam.stationary.domain;

import java.util.Comparator;

public class NameComparator implements Comparator<StarterKit>{
	

	@Override
	public int compare(StarterKit o1, StarterKit o2) {
		StarterKit s1=(StarterKit)o1;  
		StarterKit s2=(StarterKit)o2;  
		  
		return s1.getName().compareTo(s2.getName()); 
	}
}
