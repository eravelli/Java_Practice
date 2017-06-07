package com.epam.stationary.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Stationary {
	
	public static void main(String arg[]){
		
		List<StarterKit> kit = new ArrayList<>();
		
		kit.add(new Pen("Reynalod", 10));
		kit.add(new Pencil("NatRaj", 7));
		kit.add(new File("Cliper", 50));
		kit.add(new Folder("ZipFolder", 120));
		kit.add(new Marker("Black", 45));
		kit.add(new StickNotes("Manoj", 65));
		
		
		System.out.println("Sorting by Name...");
		Collections.sort(kit,new NameComparator());  
		for(StarterKit st: kit){  
		System.out.println(st.getName()+" "+st.getPrice()+" ");  
		}  
		
		System.out.println("########################");
		System.out.println("Sorting by Price......");
		System.out.println("########################");
		Collections.sort(kit,new PriceComparator());  
		for(StarterKit st: kit){  
		System.out.println(st.getName()+" "+st.getPrice()+" ");  
		}  
		
		System.out.println("########################");
		System.out.println("Sorting by Price and Name...");
		System.out.println("########################");
		Collections.sort(kit,new StarterkitComparatorByPriceAndName());  
		for(StarterKit st: kit){  
		System.out.println(st.getName()+" "+st.getPrice()+" ");  
		}  
	}

}
