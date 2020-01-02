package com.pradeep.programs;


public class QuckSortAlgo {
	
	
	static void quciksort(int[] array ,int start ,int end ) {
		
		if(end-start<2) {
			return;
		}
		
		int pivot=partion(array,start,end);
		quciksort(array, start, pivot);
		quciksort(array, pivot+1, end);
		
	}

	private static int partion(int[] array, int start, int end) {
		
		int pivot =array[start];
		int i=start;
		int j=end;
		while(i<j) {
			
			while(i<j && array[--j]>=pivot);
			if(i<j) {
				array[i]=array[j];
			}
			
			while(i<j && array[++i]<=pivot);
			if(i<j) {
				array[j]=array[i];
			}
		}
		
		array[j]=pivot;
		
		
		return j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  intarray= {20,35,-15,7,55,1,-22};
		quciksort(intarray,0,intarray.length);
		
		for (int i : intarray) {
			System.out.println(i);
		}

	}

}
