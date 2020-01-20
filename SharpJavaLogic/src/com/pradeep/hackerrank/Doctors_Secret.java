package com.pradeep.hackerrank;

import java.util.*;

public class Doctors_Secret {

	public static void main(String[] args) {
		 Scanner sc=  new Scanner(System.in);
	        
	        int tc=sc.nextInt();
	        int pc=sc.nextInt();
	        
	        if(tc<=23){
	            if(pc>=500 && pc<=1000){
	                System.out.println("Take Medicine");
	            }else{
	                System.out.println("Don't take Medicine");
	            }
	        }else{
	            System.out.println("Don't take Medicine");
	        }

	}

}
