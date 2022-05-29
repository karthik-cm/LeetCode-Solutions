package com.leetcode.easy;

public class ValidPalindromeII_680 {

	public static void main(String[] args) {
		String s = "aba";
		
		System.out.println(validPalindrome(s));
	}
	
	
	public static boolean validPalindrome(String s) {
		int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            // Found a mismatched pair - try both deletions
            if (s.charAt(i) != s.charAt(j)) {
                return (isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j));
            }
            
            i++;
            j--;
        }
        
        return true;
	}
	
	private static boolean isPalindrome(String s, int i, int j) {
		while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            
            i++;
            j--;
        }
        
        return true;
	}

}
