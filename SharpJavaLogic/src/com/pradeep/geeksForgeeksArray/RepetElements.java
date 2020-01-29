package com.pradeep.geeksForgeeksArray;

public class RepetElements {
	
	public static void repetele(int [] arr) {
		int [] count= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(count[arr[i]]==1) {
				System.out.println(arr[i]+" ");
			}else {
				count[arr[i]]++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4, 2, 4, 4, 2, 3, 1}; 
		repetele(arr);

	}

}
