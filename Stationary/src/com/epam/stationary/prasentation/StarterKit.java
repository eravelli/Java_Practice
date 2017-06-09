package com.epam.stationary.prasentation;

import java.util.Collections;
import java.util.List;

import com.epam.stationary.dao.StationaryDao;
import com.epam.stationary.exception.BaseException;
import com.epam.stationary.model.StationaryItems;
import com.epam.stationary.util.NameComparator;
import com.epam.stationary.util.PriceComparator;
import com.epam.stationary.util.StarterkitComparatorByPriceAndName;


public class StarterKit {
	
	public static void main(String arg[])throws BaseException{
		
		
		StationaryDao sd = new StationaryDao();
		List<StationaryItems> kit = sd.data();
		
		System.out.println("########################");
		System.out.println("Sorting by Name...");
		System.out.println("########################");
		Collections.sort(kit,new NameComparator());  
		for(StationaryItems st: kit){  
		System.out.println(st.getName()+" "+st.getPrice()+" ");  
		}  
		
		System.out.println("########################");
		System.out.println("Sorting by Price......");
		System.out.println("########################");
		Collections.sort(kit,new PriceComparator());  
		for(StationaryItems st: kit){  
		System.out.println(st.getName()+" "+st.getPrice()+" ");  
		}  
		
		System.out.println("########################");
		System.out.println("Sorting by Price and Name...");
		System.out.println("########################");
		Collections.sort(kit,new StarterkitComparatorByPriceAndName());  
		for(StationaryItems st: kit){  
		System.out.println(st.getName()+" "+st.getPrice()+" ");  
		}  
	}
	 

}
