package com.pradeep.recursion;

public class Factorial {
	
	public static void normalfac(int num) {
		
		int fa=1;
		while(num>0) {
			fa=fa*num;
			num--;
		}
		System.err.println(fa);
	}
	
	public static int  withfac(int num) {
		if(num==1) {
			return 1;
		}
		
		return withfac(num-1)*num;
	}
	
	public static void main(String[] args) {
		//normalfac(5);
		System.out.println(withfac(3));
		
	}

}
