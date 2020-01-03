package com.pradeep.stack;

import java.util.LinkedList;
import java.util.ListIterator;

public class checkPalindrome {
	
	static void checkpalindrome(String str) {
		LinkedList<Character> stack = new LinkedList<>();
		
		String newStr="";
		for(int i=0;i<str.length();i++) {
			stack.push(str.charAt(i));
		}
		
		ListIterator<Character> iterator= stack.listIterator();
		while(iterator.hasNext()) {
			newStr+=iterator.next();
		}
		
		if(str.equals(newStr)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkpalindrome("racecar");

	}

}
