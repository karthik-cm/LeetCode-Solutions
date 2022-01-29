package com.leetcode.easy;

public class DetectCapital_520 {

	public static void main(String[] args) {
		
	}
	
	
	
	public boolean detectCapitalUse(String word) {
		int len = word.length();
		if(len == 1) {
			return true;
		}
		
		
		if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			for(int i=2; i<len; i++) {
				if(Character.isLowerCase(word.charAt(i))) {
					return false;
				}
			}
		}
		else if(Character.isUpperCase(word.charAt(0))){
			for(int i=1; i<len; i++) {
				if(Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
		}
		else {
			for(int i=0; i<len; i++) {
				if(Character.isUpperCase(word.charAt(i))) {
					return false;
				}
			}
		}
		
		return true;
    }
	
	
	/*public boolean detectCapitalUse(String word) {
		
		// Case #1 - uppercase
		String word1 = word.toUpperCase();
		if(word.equals(word1)) {
			return true;
		}
		
		// Case #2 - lowercase
		String word2 = word.toLowerCase();
		if(word.equals(word2)) {
			return true;
		}
		
		// Case #3 - Capitalize first character
		String word3 = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
		if(word.equals(word3)) {
			return true;
		}
		
		
		return false;
    }*/

}
