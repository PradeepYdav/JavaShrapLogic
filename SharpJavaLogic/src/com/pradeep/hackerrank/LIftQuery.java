package com.pradeep.hackerrank;

import java.util.Scanner;

public class LIftQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Scanner sc= new Scanner(System.in);
	        int testcase= sc.nextInt();
	        int g=0;
	        int top=7;
	        for(int i=0;i<testcase;i++){
	            int fc=sc.nextInt();
	            int diffg=fc-g;
	            int difftop=top-fc;
	            if(diffg<difftop){
	                g=fc;
	                System.out.println("A");
	            }else if(diffg==difftop){
	                g=fc;
	                System.out.println("A");
	                
	            }else{
	                top=fc;
	                System.out.println("B");
	            }
	        }
        
    

	}

}
