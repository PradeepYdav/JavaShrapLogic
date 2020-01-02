package com.pradeep.recursion;

public class BaseLogic {
	
	public static void  foo(int num) {
		// base condition
		if(num<1) {
			return;
		}
		
		//recusrive call with reduce the problem
		foo(num-1);
		System.out.println("number is :"+num);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		foo(3);

	}

}
