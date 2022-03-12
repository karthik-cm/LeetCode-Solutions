package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses_20 {

	public static void main(String[] args) {
		String s = "([)]";
		
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		Map<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
		Stack<Character> stack = new Stack<>();
		
		for(char c : s.toCharArray()) {
			
			// if opening brackets found - push on to the stack
			if(map.containsKey(c)) {
				stack.push(c);
			}
			else {
				// else verify if the corresponding closing element is the next character
				if(stack.size() > 0 && map.get(stack.peek()) == c) {
					stack.pop();
				}
				else {
					return false;
				}
			}
		}
		
		return stack.size() == 0;
    }

}
