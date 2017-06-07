package com.epam.stationary.domain;

import java.util.Comparator;

public class StarterkitComparatorByPriceAndName implements Comparator<StarterKit>{

	@Override
    public int compare(StarterKit o1, StarterKit o2) {
        int flag = o1.getPrice() - o2.getPrice();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

	
}
