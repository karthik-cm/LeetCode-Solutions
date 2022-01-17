package com.leetcode.medium;

public class NumberOfSubstringsWithOnly1s_1513 {

	public static void main(String[] args) {
		String s = "111111";
		
		System.out.println(numSub(s));
	}
	
	public static int numSub(String s) {
		long count = 0;
		int onesCount = 0;
		
		for(char c : s.toCharArray()) {
			if(c == '0') {
				onesCount = 0;
			}
			else {
				count += ++onesCount;
			}
		}
		
		return (int) (count % 1_000_000_007);
    }

}
