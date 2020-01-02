package com.pradeep.intarray;

import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class arrysum {
	
	static void arraysumnorm(int[] numbers,int sum) {
		
		for(int i=0;i<numbers.length;i++) {
			
			int first=numbers[i];
			for(int j=i+1;j<numbers.length;j++) {
				int second=numbers[j];
				
				if(first+second==sum) {
					System.out.println("("+first+","+second+")");
				}
			}
		}
		
	}
	
	static void arrsysumwithset(int[] numbers,int sum ) {
		Set<Integer> set= new HashSet<Integer>();
	
		for(int value:numbers) {
			int target=sum-value;
			if(!set.contains(target)) {
				set.add(value);
			}else {
				System.out.println("("+value+","+target+")");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	arraysumnorm( new int[] {5,4,6,7,1,3,2},8);
		//arrsysumwithset(new int[] {5,4,6,7,1,3,2},8);
		
		Map<Object, Integer> mp= new HashMap<Object, Integer>();
		Object on =new Object();
		Object on1 =new Object();
		mp.put(on, 1);
		mp.put(on, 2);
		
		System.out.println(mp.toString());
		
	//	Arrays.sort(a);
		

	}

}
