package com.epam.practice.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringPractice {

	public static void main(String args[]) {

		Scanner keyboard = new Scanner(System.in);
		// System.out.println("Please Enter the Text ");
		// String s = keyboard.nextLine();
		System.out.println("Please Enter Opening/Closing character  :");
		String s = "Sun rises in {This is test} &you| East {this} sdfskafh (it) ppppp youtyty& |you|{ttttttttttttttttttttt}";
		// if (s != null && !s.equals("") && !s.isEmpty()) {
		String startChar = keyboard.nextLine();
		String endChar = keyboard.nextLine();
		System.out.println("Opening Character = " + startChar);
		System.out.println("Closing Character = " + endChar);
		String regex = startChar + "(.*?)" + endChar;

		keyboard.close();
		Pattern p;
		if (s.contains(startChar) && s.contains(endChar)) {

			if (startChar.matches("[a-zA-Z0-9]") && endChar.matches("[a-zA-Z0-9]")) {
				p = Pattern.compile(regex);
			} else {
				p = Pattern.compile("\\" + startChar + "(.*?)" + "\\" + endChar);
			}
			HashMap<String, String> regexMatcher= new HashMap<>();

			
		    Matcher matcher = p.matcher(s);

		    while (matcher.find()){
		    	String key = matcher.group(1);
		    	String value = matcher.group(0);
		    	regexMatcher.put(key, value);	
		    }
		    List<String> keys = new ArrayList<>();
		    keys.addAll(regexMatcher.keySet());
		    Collections.sort(keys, new StringLengthComparator());
		    System.out.println(regexMatcher.get(keys.get(0)));

/*			Matcher m = p.matcher(s);
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

			System.out.println("Remove String = " + removeStr);*/
		    String removeStr = regexMatcher.get(keys.get(0));
		    System.out.println("Remove String = " + removeStr);
			int index = s.lastIndexOf(removeStr);
			System.out.println(index);
			System.out.println(removeStr.length());
			System.out.println(index + (removeStr.length()));
			StringBuilder sb = new StringBuilder(s);

			sb.delete(index + 1, index + (removeStr.length() - 1));

			System.out.println("Remaining text message:::" + sb.toString());

		} else {
			System.out.println("Opening/Closed Character is not available in given text");
		}

		// }

	}
}
class StringLengthComparator implements Comparator<String>{ 

    @Override
        public int compare(String str1, String str2) {
            return str1.length() - str2.length();
        }
 }
	