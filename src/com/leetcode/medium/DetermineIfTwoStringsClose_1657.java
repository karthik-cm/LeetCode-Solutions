package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DetermineIfTwoStringsClose_1657 {

	public static void main(String[] args) {
		
	}
	
	public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) {
        	return false;
        }
        
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        
        for(Character c : word1.toCharArray()) {
        	mapA.put(c, mapA.getOrDefault(c, 0)+1);
        }
        
        for(Character c : word2.toCharArray()) {
        	mapB.put(c, mapB.getOrDefault(c, 0)+1);
        }
        
        if(!mapA.keySet().equals(mapB.keySet())) {
        	return false;
        }
        
        List<Integer> listA = new ArrayList<>(mapA.values());
        List<Integer> listB = new ArrayList<>(mapB.values());
        
        Collections.sort(listA);
        Collections.sort(listB);
        
        return listA.equals(listB);
    }

}
