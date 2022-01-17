package com.leetcode.easy;

import java.util.Stack;

public class MakeTheStringGreat {

	public static void main(String[] args) {
		// String s = "abBAcC";
		String s = "leEeetcode";
		System.out.println(makeGood(s));
	}
	
	
	public static String makeGood(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(stack.size() > 0 && Math.abs((int)stack.peek() - (int)c) == 32) {
				stack.pop();
			}
			else {
				stack.push(c);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		while(stack.size() > 0) {
			sb.append(stack.pop());
		}
		
		return sb.reverse().toString();
    }

}
