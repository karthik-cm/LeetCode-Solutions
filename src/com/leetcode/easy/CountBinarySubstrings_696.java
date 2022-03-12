package com.leetcode.easy;

public class CountBinarySubstrings_696 {

	public static void main(String[] args) {
		String s = "00110011";
		// String s = "101010";
		
		System.out.println(countBinarySubstrings(s));
	}
	
	
	public static int countBinarySubstrings(String s) {
		int count = 0;
		int curr = 1, prev = 0;
		
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i-1)) {
            	curr++;
            }
            else {
            	count += Math.min(curr, prev);
                prev = curr;
                curr = 1;
            }
        }
        
        return count + Math.min(curr, prev);
    }

}
