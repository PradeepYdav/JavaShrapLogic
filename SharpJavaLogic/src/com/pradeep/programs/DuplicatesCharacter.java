package com.pradeep.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesCharacter {
	
	
	
	public static void  findDuplicatechar(String words) {
		
		char [] chars=words.toCharArray();
		
		Map<Character,Integer> map= new HashMap<>();
		
		for(char c:chars) {
			
			if(map.containsKey(c)) {
				map.put(c, map.get(c) +1);
			}else {
				map.put(c,1);
			}
		}
		
		
		for(Character c:map.keySet()) {
			if(map.get(c)>0) {
				System.out.println(c+""+map.get(c));
			}
		}
		

		
//		Set<Map.Entry<Character, Integer>> entyry=map.entrySet();
//		for(Map.Entry<Character, Integer> ent:entyry){ 
//			if(ent.getValue()>0) {
//				System.out.printf("%s : %d %n", ent.getKey(), ent.getValue());
//			}
//		}
		
	}

	public static void main(String[] args) {
		findDuplicatechar("java");

	}

}
