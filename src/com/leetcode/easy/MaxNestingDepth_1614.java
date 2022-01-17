package com.leetcode.easy;

import java.util.Stack;

public class MaxNestingDepth_1614 {

	public static void main(String[] args) {
		String s = "1";
		System.out.println(maxDepth(s));
	}
	
	public static int maxDepth(String s) {
        if(s != null && s.length() > 0) {
        	int maxDepth = 0;
        	Stack<Character> stack = new Stack<>();
        	char c;
        	
        	for(int i=0; i<s.length(); i++) {
        		c = s.charAt(i);
        		
        		if(c == '(') {
        			stack.push(c);
        			maxDepth = Math.max(maxDepth, stack.size());
        		}
        		else if(c == ')') {
        			stack.pop();
        		}
        	}
        	
        	return maxDepth;
        }
		
		return 0;
    }

}
