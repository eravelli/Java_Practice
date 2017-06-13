package com.epam.practice.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractice {
	
	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Please Enter the Text ");
//		String s = keyboard.nextLine();
		System.out.println("Please Enter Opening/Closing character  :");
		String s="Sun rises in {This is test} &you& East {this} sdfskafh (it) ppppp youtyty& |you|{ttttttttttttttttttttt}";
		if(s != null && !s.equals("") && !s.isEmpty()){
		String startChar = keyboard.nextLine();
		String endChar = keyboard.nextLine();
		System.out.println("Opening Character = " + startChar);
		System.out.println("Closing Character = " + endChar);
		String regex = startChar + "(.*?)" + endChar;


		keyboard.close();
		Pattern p;
		if(s.contains(startChar) && s.contains(endChar)){
		
		if(startChar.matches("[a-zA-Z0-9]") &&  endChar.matches("[a-zA-Z0-9]")){
			p = Pattern.compile(regex);
		}else {
			p = Pattern.compile("\\"+ startChar + "(.*?)" + "\\"+ endChar);
		}

	    Matcher m = p.matcher(s);
	    int len = s.length();
		String removeString = "";

		while (m.find())

		{
			if (m.group(1).length() < len) {
				len = m.group(1).length();
				removeString = m.group(1);
			}
		}

		System.out.println("Shortest String = " + removeString);
		String removeStr = startChar + removeString + endChar;

		System.out.println("Remove String = " + removeStr);

	  /*  while (matcher.find()){
	    	
	    	System.out.println(matcher.group());
	    	System.out.println(matcher.group(0));
	    	System.out.println(matcher.group(1));
	    	String key = matcher.group(1);
	    	String value = matcher.group(0);
	    	regexMatcher.put(key, value);	
	    }
	    List<String> keys = new ArrayList<>();
	    keys.addAll(regexMatcher.keySet());
	    Collections.sort(keys, new StringLengthComparator());
	    System.out.println(regexMatcher.get(keys.get(0)));
	    System.out.println(keys.get(0));
//	    s.replace(regexMatcher.get(keys.get(0)), keys.get(0));
*/	    
		String manipString = null;
	    if(startChar.matches("[a-zA-Z0-9]")){
	    	manipString = s.replaceAll(removeStr, (startChar+endChar));
		}else{
			manipString = s.replaceAll("\\p{Punct}|\\d"+removeStr, (startChar+endChar));
		}
	    
	    System.out.println(manipString);
	    
		}
		else{
			System.out.println("Opening/Closed Character is not available in given text");
		}
		}

	}
	/*public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
//		System.out.println("Please Enter the Text ");
//		String s = keyboard.nextLine();
		System.out.println("Please Enter Opening/Closing character  :");
		String s="Sun rises in {This is test} East {this} sdfskafh {it} ppppp {ttttttttttttttttttttt}";
		if(s != null && !s.equals("") && !s.isEmpty()){
		String startChar = keyboard.nextLine();
		String endChar = keyboard.nextLine();
		System.out.println("Opening Character = " + startChar);
		System.out.println("Closing Character = " + endChar);

		keyboard.close();

		

		// Pattern p = Pattern.compile("\\{(.*?)\\}");

		Pattern p = Pattern.compile("\\" + startChar + "(.*?)" + "\\" + endChar);
		Matcher m = p.matcher(s);
		int len = s.length();
		String removeString = "";

		while (m.find())

		{
			if (m.group(1).length() < len) {
				len = m.group(1).length();
				removeString = m.group(1);
			}
		}

		System.out.println("Shortest String = " + removeString);
		String removeStr = startChar + removeString + endChar;

		System.out.println("Remove String = " + removeStr);
		String manipString = s.replaceAll("\\" + removeStr, startChar + endChar);
		System.out.println(" String final =" + manipString);
		}

	}*/

	
	
}
class StringLengthComparator implements Comparator<String>{ 

    @Override
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
 }
