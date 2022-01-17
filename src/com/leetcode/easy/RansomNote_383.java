package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RansomNote_383 {

	public static void main(String[] args) {
		String ransomNote = "a";
		String magazine = "b";
		
		System.out.println(canConstruct(ransomNote, magazine));
	}
	
	static public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character,Integer> ransomMap = new HashMap<>();
		Map<Character,Integer> magazineMap = new HashMap<>();
		
		boolean canConstruct = true;
		
		for(char c : ransomNote.toCharArray()) {
			ransomMap.put(c, ransomMap.getOrDefault(c, 0) + 1);
		}
		
		for(char c : magazine.toCharArray()) {
			magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
		}
		
		System.out.println(ransomMap);
		System.out.println(magazineMap);
		
		for(Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
			char c = entry.getKey();
			int i = entry.getValue();
			
			if(!magazineMap.containsKey(c)) {
				canConstruct = false;
				break;
			}
			else if((magazineMap.containsKey(c)) && !(i <= magazineMap.get(c))) {
				canConstruct = false;
				break;
			}
		}
		
		return canConstruct;
    }

}
