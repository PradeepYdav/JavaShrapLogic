package com.pradeep.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class revstr {
	
	static void revstrnorm(String str) {
		String st="";
		
		for(int i=str.length()-1;i>=0;i--) {
			st+=str.charAt(i);
		}
		System.out.println(st);
	}
	
	static String recrev(String str) {
		if(str.length()==0) {
			return str;
		}
		
		return recrev(str.substring(1))+str.charAt(0);
	}
	
	static void sort(int [] num) {
		
		for(int i=0;i<num.length;i++) {
			for( int j=0;j<num.length-1-i;j++) {
				if(num[j]>num[j+1]) {
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		for (int i : num) {
			System.out.println(i);
		}
	}
	
	
	static void permu(String str,String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			
			String ros=str.substring(0,i)+str.substring(i+1);
			
			permu(ros, c+ans);
		}
	}
	
	
	static void occurence(String str) {
		
		Map<Character,Integer> map= new HashMap<Character, Integer>();
		
		for(char s:str.toCharArray()) {
			map.put(s, map.containsKey(s)? map.get(s)+1:1);
			
		}
		
		for(Entry<Character, Integer> en : map.entrySet()) {
			System.out.println(en.getKey()+""+en.getValue());
		}
		
		Set<Map.Entry<Character, Integer>> set=map.entrySet();
		
		for(Map.Entry<Character, Integer> ent:set) {
			System.out.println("key:"+ent.getKey());
			System.out.println("value:"+ent.getValue());
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		revstrnorm("jack");
		
		System.out.println(recrev("mark"));
		
		sort(new int[] {50,6,-1,10,8});
		
		permu("abc","");
		occurence("java");

	}

}
