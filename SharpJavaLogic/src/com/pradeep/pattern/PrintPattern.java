package com.pradeep.pattern;

public class PrintPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1
//
//
//		2*2
//
//		3*3*3
//
//		4*4*4*4
//
//		4*4*4*4
//
//		3*3*3
//
//		2*2
//
//		1
		
		
		
		for(int i=1;i<=4;i++) {
			if(i==1) {
				System.out.println(1);
			}else {
				for(int j=0;j<i;j++) {
					System.out.print(i);
					if(j<i-1) {
						System.out.print("*");
					}
				}
			}
			System.out.println("\n");
		}
		
		for(int i=4;i>=0;i--) {
			if(i==1) {
				System.out.println(1);
			}else {
				for(int j=0;j<i;j++) {
					System.out.print(i);
					if(j<i-1) {
						System.out.print("*");
					}
				}
			}
			System.out.println("\n");
		}
		
		

	}

}
