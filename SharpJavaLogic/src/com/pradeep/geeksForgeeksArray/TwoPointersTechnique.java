package com.pradeep.geeksForgeeksArray;

public class TwoPointersTechnique {
	
	public static void sumpair(int[] arr,int n,int x) {
		int i=0;
		int j=n-1;
		
		while(i<j) {
			if(arr[i]+arr[j]==x)
				System.out.println(arr[i]+", "+arr[j]);
			
			if(arr[i]+arr[j]<x)
				i++;
			else
				j--;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] arr= {10,20,30,50,75,80};
			sumpair(arr,arr.length,70);
	}

}
