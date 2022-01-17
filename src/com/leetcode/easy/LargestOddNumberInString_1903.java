package com.leetcode.easy;

public class LargestOddNumberInString_1903 {

	public static void main(String[] args) {
		// String num = "52";
		String num = "35427";
		
		System.out.println(largestOddNumber(num));
	}
	
	public static String largestOddNumber(String num) {
		for(int i=num.length()-1; i>=0; i--) {
			if(num.charAt(i) % 2 == 1) {
				return num.substring(0, i+1);
			}
		}
		
		return "";
    }

}
