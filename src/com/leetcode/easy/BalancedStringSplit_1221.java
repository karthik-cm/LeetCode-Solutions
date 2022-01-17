package com.leetcode.easy;

public class BalancedStringSplit_1221 {

	public static void main(String[] args) {
		String s = "RLRRLLRLRL";
		System.out.println(balancedStringSplit(s));
	}
	
	public static int balancedStringSplit(String s) {
		int count = 0;
		int total = 0;
		
		for(int i=0; i<s.length(); i++) {
        	if(s.charAt(i) == 'R') {
        		count++;
        	}
        	else {
        		count--;
        	}
        	
        	if(count == 0) {
        		total++;
        	}
		}
		
		return total;
    }

}
