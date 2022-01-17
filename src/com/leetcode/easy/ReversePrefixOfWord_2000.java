package com.leetcode.easy;

public class ReversePrefixOfWord_2000 {

	public static void main(String[] args) {
		String word = "abcdefd";
		char ch = 'd';
		
		System.out.println(reversePrefix(word, ch));
	}
	
	
	public static String reversePrefix(String word, char ch) {
		StringBuilder sb = new StringBuilder();
		int i=0;
		
		for(i=0; i<word.length(); i++) {
			char currchar = word.charAt(i);
			sb.append(currchar);
			
			if(currchar == ch) {
				break;
			}
		}
		
		if(i < word.length()) {
			sb = sb.reverse();
			
			for(i=i+1 ;i<word.length(); i++) {
				sb.append(word.charAt(i));
			}
		}
		
		return sb.toString();
    }

}
