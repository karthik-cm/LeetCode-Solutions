package com.leetcode.easy;

import java.util.Stack;

public class ReverseOnlyLetters_917 {

	public static void main(String[] args) {
		String s = "Test1ng-Leet=code-Q!";
		System.out.println(reverseOnlyLetters(s));
	}
	
	
	public static String reverseOnlyLetters(String s) {
		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c)) {
				stack.push(c);
			}
		}
		
		
		String ans = "";
		for(char c : s.toCharArray()) {
			if(Character.isLetter(c)) {
				ans += stack.pop();
			}
			else {
				ans += c;
			}
		}
		
		return ans;
	}
	
	
	// Two Pointers
	/*public static String reverseOnlyLetters(String s) {
		String sArr[] = s.split("");

		int left = 0;
		int right = s.length()-1;

		while(left <= right) {
			char r = sArr[right].charAt(0);
			char l = sArr[left].charAt(0);

			if(Character.isAlphabetic(l) && Character.isAlphabetic(r)) {
				String temp = sArr[right];
				sArr[right] = sArr[left];
				sArr[left] = temp;

				left++;
				right--;
			}
			else if(!Character.isAlphabetic(l) && Character.isAlphabetic(r)) {
				left++;
			}
			else {
				right--;
			}
		}

		String ans = "";

		for(String str : sArr) {
			ans += str;
		}

		return ans;
	}*/
}
