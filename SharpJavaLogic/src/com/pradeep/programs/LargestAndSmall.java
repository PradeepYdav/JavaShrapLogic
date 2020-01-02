package com.pradeep.programs;

public class LargestAndSmall {
	
	
	static void largestAndSmallest(int [] numbers) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int num:numbers) {
			if(num>largest) {
				largest=num;
			}
			else if(num<smallest) {
				smallest=num;
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		largestAndSmallest(new int[]{-20, 34, 21, -87, 92,
                Integer.MAX_VALUE});
largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
largestAndSmallest(new int[]{Integer.MAX_VALUE, 40,
                Integer.MAX_VALUE});
largestAndSmallest(new int[]{1, -1, 0});

	}

}
