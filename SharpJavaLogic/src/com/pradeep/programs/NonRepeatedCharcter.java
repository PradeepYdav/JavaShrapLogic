package com.pradeep.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharcter {
	
	public static void nonRepeatedChar(String str) {
		Map<Character, Integer> map=new LinkedHashMap<>();
		
		for(char c:str.toCharArray()) {
			map.put(c, map.containsKey(c)?map.get(c)+1: 1);
		}
		
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue() ==1) {
				System.out.println(entry.getKey()+":"+entry.getValue());
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		nonRepeatedChar("hello");

	}

}
