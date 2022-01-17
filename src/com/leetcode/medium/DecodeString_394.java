package com.leetcode.medium;

import java.util.Stack;

public class DecodeString_394 {

	public static void main(String[] args) {
		String s = "3[a]2[bc]";
		System.out.println(decodeString(s));
	}
	
	public static String decodeString(String s) {
		Stack<Integer> counts = new Stack<>();
		Stack<String> result = new Stack<>();
		
		String res = "";
		int index = 0;
		
		while(index < s.length()) {
			// 's.charAt(index)' can be of 4 possible values : Integer, [, ], Alphabet
			
			if(Character.isDigit(s.charAt(index))) {
				int count = 0;
				while(Character.isDigit(s.charAt(index))) {
					count = 10 * count + (s.charAt(index) - '0');
					index++;
				}
				counts.push(count);
			}
			else if(s.charAt(index) == '[') {
				result.push(res);
				res = "";
				index++;
			}
			else if(s.charAt(index) == ']') {
				StringBuilder sb = new StringBuilder(result.pop());
				int count = counts.pop();
				
				for(int i=0; i<count; i++) {
					sb.append(res);
				}
				res = sb.toString();
				index++;
			}
			else {
				res += s.charAt(index);
				index++;
			}
		}
		
		return res;
    }

}
