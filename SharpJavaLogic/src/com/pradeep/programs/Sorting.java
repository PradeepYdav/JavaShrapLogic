package com.pradeep.programs;

public class Sorting {
	
	static void sort(int [] number) {
		for(int i=0;i<number.length;i++) {
			for(int j=0;j<number.length-1-i;j++) {
				if(number[j]>number[j+1]) {
					int temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}
		}
		
		for (int i : number) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[]={100,20,15,30,5,75,40};
		sort(arr);

	}

}
