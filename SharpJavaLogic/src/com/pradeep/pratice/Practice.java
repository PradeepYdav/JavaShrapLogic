package com.pradeep.pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {
	
	public static void revnorm(String str) {
		String st="";
		for(int i=str.length()-1;i>=0;i--) {
			st+=str.charAt(i);
		}
		System.out.println(st);
	}
	
	
	public static String revstrrec(String str) {
		if(str.length()==0) {
			return  str;
		}
		return revstrrec(str.substring(1)) + str.charAt(0);
	}

	
public static void sort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
		}
	}


	public static void strpermu(String str,String res) {
		
		if(str.length()==0) {
			System.out.println(res);
			return ;
		}
		
		for(int i=0;i<str.length();i++) {
			char st=str.charAt(i);
			
			String ros=str.substring(0,i)+str.substring(i+1);
			
			 strpermu(ros, st+res);
		}
		
		
	}
	
	public static void countsnochar(String str) {
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		
		for(char ch:str.toCharArray()) {
			map.put(ch, map.containsKey(ch)? map.get(ch)+1:1);
		}
		
		for(Entry<Character, Integer> ent:map.entrySet()) {
			System.out.println("key is :"+ent.getKey()+" value is :"+ent.getValue());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		revnorm("jack");
		System.out.println(revstrrec("mark"));
		
		sort(new int[]  {100,67,89,690,-890,89,-65});
		
		strpermu("abc","");
		
		countsnochar("javavaavvavavavchnascasvaifwqeofifh");
	}
	
	static void check() {
		List<Integer> li= new ArrayList<>();
		
	}
	
	
}
