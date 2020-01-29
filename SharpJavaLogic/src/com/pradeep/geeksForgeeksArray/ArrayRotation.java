package com.pradeep.geeksForgeeksArray;

public class ArrayRotation {
	
	public static  void  rotation(int [] array,int index) {
		int lenghth=array.length;
		int [] temp= new  int [index];
		
		for(int i=0;i<index;i++) {
			temp[i]=array[i];
		}
		
		for(int i=0;i<lenghth-index;i++) {
			array[i]=array[i+index];
		}
		int j=0;
		int templenght=temp.length;
		for(int k=templenght;k>0;k--) {
			array[lenghth-k]=temp[j];
			j++;
		}
		
	}
	
	public static void rotate (int [] arr) {
		int x=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=x;
	}

	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,5};
		
	//	rotation(array,2);
		
		rotate(array);
		
		for(int i:array) {
			System.out.println(i);
		}

	}

}
