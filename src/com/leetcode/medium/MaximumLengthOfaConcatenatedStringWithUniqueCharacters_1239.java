package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthOfaConcatenatedStringWithUniqueCharacters_1239 {
	// Intuition : Iterative & Backtracking

	
	public static void main(String[] args) {
		List<String> arr = Arrays.asList(new String[] {"un", "iq", "ue"});
		// List<String> arr = Arrays.asList(new String[] { "cha","r","act","ers"});
		
		System.out.println(maxLength(arr));
	}
	
	
	// Iterative
    public static int maxLength(List<String> arr) {
        List<String> list = new ArrayList<>();
        list.add("");
        int maxlen = 0;
        
        for(String word : arr) {
            int size = list.size();
            
            for(int i=0; i<size; i++) {
                // Form a new result combination and
            	// Use a set to check for duplicate characters
                String result = list.get(i) + word;
                Set<Character> set = new HashSet<>();
                
                for(char c : result.toCharArray()) {
                    set.add(c);
                }
                
                if(result.length() == set.size()) {
                    list.add(result);
                    maxlen = Math.max(maxlen, result.length());
                }
            }
        }
        
        return maxlen;
    }
	
	
	
	
	// Backtracking - DFS
    /*public static int maxLength(List<String> arr) {
        return dfs(arr, 0, "");
    }

    private static int dfs(List<String> arr, int pos, String res) {    
        // Use a set to check res for duplicate characters
        Set<Character> resSet = new HashSet<>();
        for(char c : res.toCharArray()) {
            resSet.add(c);
        }
        
        if(res.length() != resSet.size()) {
            return 0;
        }

        // Recurse through each possible next option and find the best answer
        int maxlen = res.length();
        for (int i=pos; i<arr.size(); i++) {
            maxlen = Math.max(maxlen, dfs(arr, i + 1, res + arr.get(i)));
        }
        
        return maxlen;
    }*/
    
}
