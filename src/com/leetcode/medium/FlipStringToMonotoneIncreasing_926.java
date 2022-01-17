package com.leetcode.medium;

public class FlipStringToMonotoneIncreasing_926 {

	/*just for those who have troubles understanding intuition. 
	Basically we go through string and found out how much 1 before index much be flipped to 0 and 
	how much 0 after index need to be flipped to 1. 
	adds them up and get min for result*/
	
	public static void main(String[] args) {
		// String s = "00110";
		String s = "0101100";
		System.out.println(minFlipsMonoIncr(s));
	}
	
	
	public static int minFlipsMonoIncr(String s) {
        int one = 0;
        int flip = 0;
        
        for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == '1') {
        		one++;
        	}
        	else {
        		flip++;
        	}
        	
        	flip = Math.min(one, flip);
        }
        
        return flip;
    }

}
