package com.pradeep.pratice;

public class QucikoSort {

	static void quicksort(int arr[],int start ,int end) {
		if(end-start<2) {
			return;
		}
		
		int pivot=partion(arr,start,end);
		quicksort(arr, start, pivot);
		quicksort(arr, pivot+1, end);
		
		
	}
	
	private static int partion(int[] arr, int start, int end) {
		int pivot=arr[start];
		int i=start;
		int j=end;
		
		if(i<j) {
			
			while(i<j && arr[--j]>=pivot);
			if(i<j) {
				arr[i]=arr[j];
			}
			
			while(i<j && arr[++i]<=pivot) {
				arr[j]=arr[i];
			}
		}
		arr[j]=pivot;
		
		
		return j;
	}

	public static void main(String[] args) {
		
		
		int []  intarray= {20,35,-15,7,55,1,-22};
		quicksort(intarray,0,intarray.length);
		
		for (int i : intarray) {
			System.out.println(i);
		}

	}

}
