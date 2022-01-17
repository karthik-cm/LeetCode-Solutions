package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses_22 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParenthesis(n));
	}
	
	// Recursion
	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		int open = n;
		int close = n;
		
		solve(open, close, "", list);
		
		return list;
	}
	
	// Recursion method - Extended ip op method
	private static void solve(int open, int close, String op, List<String> list) {
		if(open == 0 && close == 0) {
			list.add(op);
			return;
		}
		
		if(open > 0) {
			// Open Parenthses
			String op1 = op;
			op1 += "(";
			
			solve(open-1, close, op1, list);
		}
		
		if(close > open) {
			String op1 = op;
			op1 += ")";
			
			solve(open, close-1, op1, list);
		}
	}
	
	
	
	
	// Backtracking Approach
	/*public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<>();
		backtrack(list, "", 0, 0, n);
		return list;
	}*/
	
	// Backtracking template ;)
	/*public static void backtrack(List<String> list, String str, int open, int close, int max) {
		// Bounding function / condition
		if(str.length() == max*2) {
			list.add(str);
			return;
		}
		
		// Make possible decisions
		if(open < max) {
			backtrack(list, str+"(", open+1, close, max);
		}
		if(close < open) {
			backtrack(list, str+")", open, close+1, max);
		}
	}*/

}
