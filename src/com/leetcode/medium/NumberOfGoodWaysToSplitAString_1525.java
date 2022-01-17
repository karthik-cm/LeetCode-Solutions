package com.leetcode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberOfGoodWaysToSplitAString_1525 {

	public static void main(String[] args) {
		String s = "aacaba";
		System.out.println(numSplits(s));
	}
	
	public static int numSplits(String s) {
		if(s != null && s.length() > 0) {
			Map<Character, Integer> map = new HashMap<>();
		    
		    for(int i = 0; i < s.length(); i++) {
		    	char c = s.charAt(i);
		    	map.put(c, map.getOrDefault(c, 0)+1);
		    }
		    
		    Set<Character> set = new HashSet<>();
		    int count = 0;
		    
		    for(int i = 0; i < s.length(); i++) {
		    	char c = s.charAt(i);
		    	set.add(c);
		    	map.put(c, map.get(c)-1); // Remove the char from the right side that we just added to the left
		    	
		    	if(map.get(c) == 0) {
		    		map.remove(c);
		    	}

		    	if(set.size() == map.size()) {
		    		count++;
		    	}
		      
		    	if(set.size() > map.size()) {
		    		break;
		    	}
		    }
		    
		    return count;
		}
		 
		return 0;
	}
	
	
	
	
	/*public static int numSplits(String s) {
		if(s != null && s.length() > 0) {
			int count = 0;
			int breakPoint = 1;
			
			while(breakPoint < s.length()) {
				String leftStr = s.substring(0, breakPoint);
				String rightStr = s.substring(breakPoint);
				
				Set<Character> set1 = new HashSet<>();
				Set<Character> set2 = new HashSet<>();
				
				for(int i=0; i<leftStr.length(); i++) {
					set1.add(leftStr.charAt(i));
				}
				
				for(int i=0; i<rightStr.length(); i++) {
					set2.add(rightStr.charAt(i));
				}
				
				
				for(char c : leftStr.toCharArray()) {
					set1.add(c);
				}
				
				for(char c : rightStr.toCharArray()) {
					set2.add(c);
				}
				
				if(set1.size() == set2.size()) {
					count++;
				}
				
				breakPoint++;
			}
			
			return count;
		}
		 
		return 0;
	}*/

}
