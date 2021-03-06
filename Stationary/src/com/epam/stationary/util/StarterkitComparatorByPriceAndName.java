package com.epam.stationary.util;

import java.util.Comparator;

import com.epam.stationary.model.StationaryItems;

public class StarterkitComparatorByPriceAndName implements Comparator<StationaryItems>{

	@Override
    public int compare(StationaryItems o1, StationaryItems o2) {
        int flag = o1.getPrice() - o2.getPrice();
        if(flag==0) flag = o1.getName().compareTo(o2.getName());
        return flag;
    }

	
}
