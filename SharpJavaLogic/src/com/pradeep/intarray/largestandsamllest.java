package com.pradeep.intarray;

public class largestandsamllest {
	
	static void larsm(int[] num) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		
		for(int i :num) {
			if(i>largest) {
				largest=i;
			}else if(i<smallest) {
				smallest=i;
			}
		}
		
		System.out.println("largest :"+largest);
		System.out.println("smallest :"+smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		larsm(new int[] {500,788,990,-6});

	}

}
