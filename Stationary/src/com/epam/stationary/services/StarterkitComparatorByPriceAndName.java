package com.epam.stationary.services;

import java.util.Comparator;

import com.epam.stationary.domain.StationaryItems;

public class StarterkitComparatorByPriceAndName implements Comparator<StationaryItems>{

	@Override
    public int compare(StationaryItems o1, StationaryItems o2) {
        int flag = o1.getPrice() - o2.getPrice();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

	
}
