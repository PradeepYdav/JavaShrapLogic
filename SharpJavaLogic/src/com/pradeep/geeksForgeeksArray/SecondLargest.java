package com.pradeep.geeksForgeeksArray;

public class SecondLargest {
	
	public static void secondLargest(int arr[],int length) {
		int first,second;
		first=second=Integer.MIN_VALUE;
		
		for(int i=0;i<length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}else if(arr[i]>second && arr[i]!=first) {
				second=arr[i];
			}
		}
		
		if(second==Integer.MIN_VALUE) {
			System.out.println("no second largest");
		}else {
			System.out.println(second);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12, 35, 1, 10, 34, 1}; 
		int len=arr.length;
		secondLargest(arr,len);

	}

}
