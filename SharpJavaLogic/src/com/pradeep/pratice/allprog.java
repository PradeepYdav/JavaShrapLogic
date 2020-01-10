package com.pradeep.pratice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class allprog {
	
	public   static void  revstr(String str) {
		String newst="";
		for(int i=str.length()-1;i>=0;i--) {
			newst+=str.charAt(i);
		}
		System.out.println(newst);
		
	}

	static String revstrusingrec(String str) {
		if(str.length()==0) {
			return str;
		}
		return revstrusingrec(str.substring(1))+str.charAt(0);
	}
	
	static void permu(String str,String res) {
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		
		
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			String rest=str.substring(0,i) +str.substring(i+1);
			
			permu(rest, ch+res);
		}
	}
	
	
	static void oocrnce(String str) {
		
		Map<Character, Integer> mp= new HashMap<Character, Integer>();
		
		for(char c:str.toCharArray()) {
			mp.put(c, mp.containsKey(c)? mp.get(c)+1:1);
		}
		
		Set<Map.Entry<Character, Integer>> setentry=mp.entrySet();
		
		Integer a=0;
		char key = 0;
		
		for(Map.Entry<Character, Integer> en:setentry) {
			
			if(en.getValue()>a) {
				a=en.getValue();
				key=en.getKey();
			System.out.println(en.getKey()+" "+en.getValue());
			}
			
		}
		
		
		System.out.println(key+" "+a);
	}
	
	
	static void DistinctCharsCount(String str) {
		Map<Character, Integer> mp= new HashMap<Character,Integer>();
		
		for(char c :str.toCharArray()) {
			
			// uncomment in java 8
			//mp.merge(c, 1, Integer::sum);
		}
		
		System.out.println(mp.toString());
		
		for(Entry<Character, Integer> en:mp.entrySet()) {
			System.out.println("key : "+en.getKey()+"  Value"+en.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		revstr("jack");
//		
//		System.out.println(revstrusingrec("mark"));
//		permu("abc", "");
//		oocrnce("cakcnalcbacacbasbvaklvbalfbeqwoifh qiufeg");
		
		DistinctCharsCount("DistinctCharsCount".toLowerCase());

	}

}
