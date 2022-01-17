package com.leetcode.medium;

import java.util.Stack;

public class ScoreOfParentheses_856 {

	public static void main(String[] args) {
		String s = "(()(()))";
		System.out.println(scoreOfParentheses(s));
		
		
		System.out.println(s.charAt(-1));
	}
	
	
	public static int scoreOfParentheses(String s) {
	    Stack<Integer> stack = new Stack<>();
	    stack.push(0); // The score of the current frame

	    for(char c : s.toCharArray()) {
	        if(c == '(') {
	            stack.push(0);
	        }
	        else {
	            int v = stack.pop();
	            int w = stack.pop();
	            stack.push(w + Math.max(2 * v, 1));
	        }
	    }

	    return stack.pop();
	}
	
	
	/*public int scoreOfParentheses(String S) {
        int ans = 0, bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            if (S.charAt(i) == '(') {
                bal++;
            } else {
                bal--;
                if (S.charAt(i-1) == '(')
                    ans += 1 << bal;
            }
        }

        return ans;
	}*/

}
