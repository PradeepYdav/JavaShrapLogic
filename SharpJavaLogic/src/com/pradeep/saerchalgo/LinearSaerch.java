package com.pradeep.saerchalgo;

public class LinearSaerch {
	
	static int linearsearch(int[] input,int value) {
		for(int i=0;i<input.length;i++) {
			if(input[i]==value) {
			return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int [] array= new int[] {-25,-15,8,10,23,85};
		
		System.out.println(linearsearch(array, 8));
		System.out.println(linearsearch(array, 85));
		System.out.println(linearsearch(array, 80));

	}

}
