package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams_49 {

	public static void main(String[] args) {
		
	}
	
	
	// Approach 1: Categorize by Sorted String
	
	/*Intuition
	Two strings are anagrams if and only if their sorted strings are equal.

	Algorithm
	Maintain a map ans : {String -> List} where each key 'K' is a sorted string, and 
	each value is the list of strings from the initial input that when sorted, are equal to 'K' */
	
	
	public List<List<String>> groupAnagrams(String[] strs) {
		if(strs.length == 0) {
			return new ArrayList<>();
		}
		
        Map<String, List<String>> map = new HashMap<>(); // {abc, [bac, cab]}
        
        for(String s : strs) {
            char cArr[] = s.toCharArray();
            Arrays.sort(cArr);
            
            String key = String.valueOf(cArr);
            
            if(!map.containsKey(key)) {
            	map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
    }

}
