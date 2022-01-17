package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation_784 {

	public static void main(String[] args) {
		// String s = "a1b2";
		String s = "C";
		System.out.println(letterCasePermutation(s));
	}

	// Recursion - Starts
	
	private static List<String> list = new ArrayList<>();
	
	public static List<String> letterCasePermutation(String s) {
		solve(s, "");
		return list;
    }

	private static void solve(String ip, String op) {
		if(ip.length() == 0) {
			if(!list.contains(op)){
				list.add(op);
			}
			return;
		}
		
		String op1 = op;
		String op2 = op;
		
		
		if(ip.charAt(0) >= 'a' && ip.charAt(0) <= 'z') {
            // if alphabet then for op1 - lowercase | op2 - uppercase
            op1 += Character.toLowerCase(ip.charAt(0));
			op2 += Character.toUpperCase(ip.charAt(0));
		}
		else{
            // if digit then for op1 / op2 as it is
            op1 += ip.charAt(0);
			op2 += ip.charAt(0);
		}
		
		ip = ip.substring(1);
		
		solve(ip, op1);
		
		solve(ip, op2);
	}
	
	// Recursion - Ends

}
