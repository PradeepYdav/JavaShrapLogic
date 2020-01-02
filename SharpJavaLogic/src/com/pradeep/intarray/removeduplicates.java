package com.pradeep.intarray;

import java.util.Arrays;

public class removeduplicates {

	public static int[]  removedupli(int [] numbers) {
		 
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers.length-1-i;j++ ) {
				if(numbers[j]>numbers[j+1]) {
					int  temp =numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		
		int [] result = new int[numbers.length];
		
		int previous=numbers[0];
		result[0]=previous;
		
		for(int i=1;i<numbers.length;i++) {
			int ch=numbers[i];
			
			if(previous!=numbers[i]) {
				result[i]=ch;
			}
			
			previous=ch;
		}
		
		return result ;
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(removedupli(new int[]{-5,10,3,50,50,22,22,67,67,89,0})));
		//removedupli(new int[]{-5,10,3,50,50,22,22,67,67,89,0});

	}

}
