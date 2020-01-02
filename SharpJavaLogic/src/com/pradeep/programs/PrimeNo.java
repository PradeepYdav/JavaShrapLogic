package com.pradeep.programs;

public class PrimeNo {
	
	public static boolean isprime(int  num) {
		int sqrt=(int) Math.sqrt(num) +1;
		
		for (int i =2;i<sqrt;i++) {
			if(num%i==0) {
				return false;
				
			}
		}
		
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isprime(25));
	}
	
	

}
