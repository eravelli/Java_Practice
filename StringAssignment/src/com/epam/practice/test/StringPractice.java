package com.epam.practice.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPractice {

	public static StringBuilder removechar(String string,Character element){
	 	
	 	char[] arr = string.toCharArray();
	 	//blah blah,i used one string function,so what?
	 	ArrayList<Character> arrlist = new ArrayList<Character>();
		for(int i = 0;i<=string.length()-1;i++){
			arrlist.add(((Character)arr[i]));
 
		}
 
		for(int j = 0;j<=arrlist.size()-1;j++){
			if(arrlist.get(j).equals(element)){
				arrlist.remove(j);
				//remove here is an arraylist function
			}
		}
 
		StringBuilder result = new StringBuilder(arrlist.size());
		//StringBuilder is not a function,so shut ur trap
		for(Character k:arrlist){
			result.append(k);
		}
		return result;
	}
	public static void main(String args[]){
		System.out.print(removechar("penicillin",'i'));
	}
	
	
	/*public static void main(String arg[]){
		
		String textMessage = "creating java string by new keyword";
		
			String a;
	        String s;
	        Scanner scan = new Scanner(System.in);

	        System.out.println("enter a first character");
	        a = scan.nextLine();
	        
	        if(!textMessage.contains(a)){
	        	 System.out.println("Please re enter avaiabale character");
	        	 a = scan.nextLine();
	        }
	       
	        System.out.println("enter a second character");
	        s = scan.nextLine();
	        if(!textMessage.contains(s)){
	        	 System.out.println("Please re enter avaiabale character");
	        	 s = scan.nextLine();
	        }
	        
	       int start= textMessage.indexOf(a);
	       
	       int end= textMessage.indexOf(s)+1;
	        
	        
	       StringBuilder sb = new  StringBuilder(textMessage);	        
		
	       sb.delete(start, end);
	       
	       System.out.println("Remaining text message:::" + sb.toString());
	}*/
	
}
