package com.leetcode.easy;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		String s = "race a car";
		System.out.println(isPalindrome(s));
	}
	
	public static boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
        	char c = str.charAt(i);
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                sb.append(c);
            }
        }
        
        str = sb.toString();
        System.out.println("str = "+str);
        
        String strRev = sb.reverse().toString();
        System.out.println("strRev = "+strRev);
        
        return str.equals(strRev);
        
    }
}
