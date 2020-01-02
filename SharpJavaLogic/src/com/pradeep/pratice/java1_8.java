package com.pradeep.pratice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class java1_8 {

	
	
	public static void main(String[] args) {
		
		
		List<Integer> list= new ArrayList<Integer>();
		
		for(int i=0; i<10;i++) {
			list.add(new Integer(i));
		}
		List<Integer> l1= list.stream().filter(x -> x%2==0).collect(Collectors.toList());
		
		System.out.println(l1);
		System.out.println(list.stream().filter(x -> x>5).collect(Collectors.toList()));

		

	}

}
