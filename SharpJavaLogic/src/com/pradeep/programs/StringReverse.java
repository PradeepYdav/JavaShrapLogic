package com.pradeep.programs;

public class StringReverse {
	
//	public static void reversestrnorm(String str) {
//		char [] leeters=str.toCharArray();
//		String newstr="";
//		for (int i=str.length()-1;i>=0;i--) {
//			newstr=newstr+leeters[i];
//		}
//		
//		System.out.println(newstr);
//	}
//	
//	public static String revserseWithRecursion(String str)
//    {
//        if (str.isEmpty())
//            return str;
//        //Calling Function Recursively
//        return revserseWithRecursion(str.substring(1)) + str.charAt(0);
//    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//reversestrnorm("jack");
		//System.out.println(revserseWithRecursion("jack"));
		
		revnorm("mark");
		
		System.out.println(revwithrec("bill"));

	}
	
 static void revnorm(String str) {
	 
	String st="";
	
	for (int i=str.length()-1;i>=0;i--) {
		st+=str.charAt(i);
	}
	
	System.err.println(st);
 }
 
 static String revwithrec(String str) {
	 if(str.length()==0) {
		 return str;
	 }
	 
	 return revwithrec(str.substring(1))+ str.charAt(0);
 }
	
	

}
