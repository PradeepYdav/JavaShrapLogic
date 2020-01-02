package com.pradeep.programs;

public class checkplaindrom {
	
	static String revstr(String str) {
		if(str.length()==0) {
			return str;
		}
		
		return revstr(str.substring(1)) +str.charAt(0);
	}
	
	static boolean isPalindromString(String str) {
		if (revstr(str).equals(str)) {
			return true;
		}else {
		return false;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Is aaa palindrom?: " + isPalindromString("aaa"));
        System.out.println("Is abc palindrom?: " + isPalindromString("abc"));
       
        System.out.println("Is bbbb palindrom?: " + isPalindromString("bbbb"));
        System.out.println("Is defg palindrom?: " + isPalindromString("defg"));
     
	}

}
