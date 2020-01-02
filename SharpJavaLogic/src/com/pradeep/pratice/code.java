package com.pradeep.pratice;

import java.util.Scanner;

public class code {
	
	static void revstr( String str) {
		String st="";
		for(int i=str.length()-1;i>=0;i--) {
			st+=str.charAt(i);
		}
		
		System.out.println(st);
	}
	
	static String revstrrec(String str) {
		if(str.length()==0) {
			return str;
		}
		
		return revstrrec(str.substring(1))+str.charAt(0);
	}
	
	
	static void permu(String str,String res) {
		
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		
		
		for(int i=0;i<str.length();i++) {
			
			char ch=str.charAt(i);
			
			String ros=str.substring(0,i) +str.substring(i+1);
			
			permu(ros, res+ch);
			
		}
		
	}
	
	static void sort(int array[] ) {
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length-i-1;j++) {
				if(array[j]>array[j+1]) {
					int tem=array[j];
					array[j]=array[j+1];
					array[j+1]=tem;
				}
			}
		}
		
		for(int i :array) {
			System.out.println(i);
		}
	}
	
	static void quicksort(int array[],int start,int end) {
		if(end-start<2) {
			return;
		}
		
		
		int pivot=partition(array, start, end);
		quicksort(array, start, pivot);
		quicksort(array, pivot+1, end);
	
		
	}
	
	static int partition(int array[],int start,int end) {
		
		int pivot=array[start];
		int i=start;
		int j=end;
		
		if(i<j) {
			
			
			while(i<j && array[--j]>=pivot);
			if(i<j) {
				array[i]=array[j];
			}
			
			while(i<j&& array[++i]<=pivot);
			if(i<j) {
				array[j]=array[i];
			}
		}
		
		array[j]=pivot;
		
		return j;
		
	}
	
	static void  quicks2(int array[],int start,int end ) {
		if(end-start<2) {
			return;
		}
		
		int pivot=partition2(array, start, end);
		quicks2(array,start,pivot);
		quicks2(array, pivot+1, end);
		
	}
	

	private static int partition2(int[] array, int start, int end) {
		
		int pivot=array[start];
		int i=start;
		int j= end;
		
		if(i<j) {
			
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
//		revstr("jack");
//		System.out.println(revstrrec("mark"));
		
//		Scanner sc= new Scanner(System.in);
//		
//		System.out.println("Enter the data:");
//		String s=sc.nextLine();
//		
//		revstr(s);
		
//		permu("abc","");
//		
//		sort(new int[] {1,-5,-7,8,6,89,100});
		
		
		int []  intarray= {20,35,-15,7,55,1,-22};
		quicks2(intarray,0,intarray.length);
		
		for (int i : intarray) {
			System.out.println(i);
		}
		
	}

}
