package com.leetcode.medium;

import java.util.Arrays;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram_1347 {

	// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/discuss/601103/ONLY-SOLUTION-THAT-BEATS-100-TIME-AND-100-SPACE!
	
	
	public static void main(String[] args) {
		/*String s = "bab";
		String t = "aba";*/
		
		String s = "leetcode";
		String t = "practice";
		
		System.out.println(minSteps(s, t));
	}
	
	
	public static int minSteps(String s, String t) {
		int steps = 0;
		
		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		
		int count[] = new int[26];
		
		for(int i=0; i<s.length(); i++) {
			count[sArr[i]-'a']++;
			count[tArr[i]-'a']--;
		}
		
		System.out.println(Arrays.toString(count));
		
		for(int c : count) {
			if(c > 0) {
				steps += c;
			}
		}
		
		return steps;
    }

}
