package com.leetcode.medium;

public class MinimumRemoveToMakeValidParentheses_1249 {
	// Filter String by putting some wild card character '*' in place
	
	public static void main(String[] args) {
		String s = "lee(t(c)o)de)";
		
		System.out.println(minRemoveToMakeValid(s));
	}

	 
	public static String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        int open = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == '(') {
            	open++;
            }
            else if(arr[i] == ')') {
                if(open == 0) {
                    arr[i] = '*';
                }
                else {
                    open--;
                }
            }
        }

        for(int i=arr.length-1; i>=0; i--) {
            if(open > 0 && arr[i] == '(') {
                arr[i] = '*';
                open--;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != '*') {
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
