package com.leetcode.hard;

import java.util.Stack;

public class LongestValidParenthese_32 {

	public static void main(String[] args) {
		String s = ")()())";
		// String s = "()(()";
		System.out.println(longestValidParentheses(s));
	}
	

    public static int longestValidParentheses(String s) {
        int maxAns = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(i);
            }
            else {
                stack.pop();
                if(stack.empty()) {
                    stack.push(i);
                }
                else {
                    maxAns = Math.max(maxAns, i - stack.peek());
                }
            }
        }
        
        return maxAns;
    }
	
	/*public static int longestValidParentheses(String s) {
		if(s != null && !s.isEmpty() && s.length() > 0) {
			Stack<Character> stack = new Stack<>();
			int maxAns = 0;
			
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				
				if(c == '(') {
					stack.push(c);
				}
				else {
					if(stack.size() > 0) {
						stack.pop();
						maxAns += 2;
					}
					
					if(stack.size() == 0) {
						maxAns = Math.max(a, b);
					}
				}
			}
			
			return maxAns;
		}
		
		return 0;
    }*/

}
