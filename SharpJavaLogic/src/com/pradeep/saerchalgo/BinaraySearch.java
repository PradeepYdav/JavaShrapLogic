package com.pradeep.saerchalgo;

public class BinaraySearch {
	
	public static  int iterativeBinarySeach(int[] input,int  value) {
		int start=0;
		int end=input.length;
		
		while(start<end) {
			int midPoint=(start+end)/2;
			
			if(input[midPoint]==value) {
				return midPoint;
			}else if (input[midPoint]<value) {
				start=midPoint+1;
			}else {
				end=midPoint;
			}
			
		}
		
		return -1;
		
	}
	
	
	public static int recurciveiteration(int [] input,int value) {
		return recurciveIteration(input,0,input.length,value);
	}

	private static int recurciveIteration(int[] input, int start, int end, int value) {
		
		if(start>=end) {
			return -1;
		}
		
		int midpoint=(start+end)/2;
		
		if(input[midpoint]==value) {
			return midpoint;
		}else if(input[midpoint]<value) {
			return recurciveIteration(input, midpoint+1, end, value);
		}else {
			return recurciveIteration(input, start, midpoint, value);
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array= new int[] {-25,-15,8,10,23,85};
		
		System.out.println(iterativeBinarySeach(array,10));
		System.out.println(iterativeBinarySeach(array,-25));
		System.out.println(iterativeBinarySeach(array,23));
		System.out.println(iterativeBinarySeach(array,85));
		System.out.println(iterativeBinarySeach(array,69));
		
		System.out.println("--------------------------------------------");
		
		System.out.println(recurciveiteration(array,10));
		System.out.println(recurciveiteration(array,-25));
		System.out.println(recurciveiteration(array,23));
		System.out.println(recurciveiteration(array,85));
		System.out.println(recurciveiteration(array,69));


	}

}
