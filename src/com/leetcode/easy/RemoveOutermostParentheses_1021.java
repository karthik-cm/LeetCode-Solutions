package com.leetcode.easy;

public class RemoveOutermostParentheses_1021 {

	public static void main(String[] args) {
		// String s = "()()";
		String s = "(()())(())";
		
		System.out.println(removeOuterParentheses(s));
	}
	
	
	public static String removeOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
        int counter = 0;
        
        for(char c : s.toCharArray()){
            if(c == '('){
                if(counter != 0) sb.append(c);
                counter++;
            }
            else{
                counter--;
                if(counter != 0) sb.append(c);
            }
        }
        
        return sb.toString();
    }

}
