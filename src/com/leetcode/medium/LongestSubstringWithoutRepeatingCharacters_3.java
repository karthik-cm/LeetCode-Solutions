package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	// 3. Longest Substring Without Repeating Characters - Medium

	public static void main(String[] args) {
		// String s = "abcabcbb";
		String s = "pwwkew";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	
	// Brute Force
	/*public static int lengthOfLongestSubstring(String s) {
		if(s != null && s.length() > 0) {
			int maxLen = 0;
			Set<Character> set = null;
			for(int i=0; i<s.length(); i++) {
				set = new HashSet<>();
				int count = 0;
				
				for(char c : s.substring(i).toCharArray()) {
					if(!set.contains(c)) {
						set.add(c);
						count++;
					}
					else {
						break;
					}
				}
				
				maxLen = Math.max(maxLen, count);
			}
			
			return maxLen;
		}
		
		return 0;
    }*/
	
	
	// Sliding Window Approach
	// abcddabc
	public static int lengthOfLongestSubstring(String s) {
		if(s != null && s.length() > 0) {
			int start = 0;
			int end = 0;
			int maxLen = 0;
			
			Set<Character> set = new HashSet<>();
			
			while(end < s.length()) {
				if(!set.contains(s.charAt(end))) {
					set.add(s.charAt(end));
					end++;
					maxLen = Math.max(maxLen, set.size());
				}
				else {
					set.remove(s.charAt(start));
					start++;
				}
			}
			
			return maxLen;
		}
		
		return 0;
	}

}
