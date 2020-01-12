package com.pradeep.hackerrank;

import java.util.Scanner;

public class Friend_Relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		//int tc= sc.nextInt();
		int tc= 9;
		int s=2;
		int h=tc*2-s;
		for(int i=0;i<tc;i++) {
			for(int j=0;j<s/2;j++) {
				System.out.print("*");
			}
			
			for(int k=0;k<h;k++) {
				System.out.print("#");
			}
			
			for(int l=0;l<s/2;l++) {
				System.out.print("*");
			}
			
			System.out.println("\n");
			
			s=s+2;
			h=h-2;
		}

	}

}
