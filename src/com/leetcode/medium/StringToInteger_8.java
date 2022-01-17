package com.leetcode.medium;

import java.math.BigInteger;

public class StringToInteger_8 {

	public static void main(String[] args) {
		// String s = "   -42";
		String s = "-9223372036854775809";
		System.out.println(myAtoi(s));
	}

	public static int myAtoi(String s) {
		int atoi = 0;
		
		if(s != null && s.trim().length() > 0) {
			s = s.trim();
			
			char sign = (s.charAt(0) == '-') ? '-' : '+';
			StringBuffer sb = new StringBuffer();
			
			s = s.startsWith("-") || s.startsWith("+") ? s.substring(1) : s;
			
			/* if(s.length() > 1) {
				char charAt1 = s.charAt(1);
				if(charAt1 != '.' && charAt1 != '-' && !Character.isDigit(charAt1)) {
					return 0;
				}
				
				s = s.charAt(0) == '.' ? '0'+s : s; 
			}*/
			
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				
				if(Character.isDigit(c)) {
					sb.append(c);
				}
				else if(c == '.' || c == '-' || c == '+' || Character.isAlphabetic(c) || Character.isWhitespace(c)) {
					break;
				}
			}
			
			System.out.println(sb.toString());
			
			BigInteger alpToInt = null;
			
			if(sb.length() > 0) {
				alpToInt = new BigInteger(sign +sb.toString());
				
				double posClampValue = Math.pow(2,31) - 1;
				double negClampValue = Math.pow(-2,31);
				
				if(alpToInt.doubleValue() > posClampValue) {
					atoi = (int) posClampValue;
				}
				else if(alpToInt.doubleValue() < negClampValue) {
					atoi = (int) negClampValue;
				}
				else {
					atoi = alpToInt.intValue();
				}
			}
		}
		
		return atoi;
    }
}
