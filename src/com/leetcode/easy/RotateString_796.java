package com.leetcode.easy;

public class RotateString_796 {

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "abced";
		
		System.out.println(rotateString(s, goal));
	}
	
	public static boolean rotateString(String s, String goal) {
		if(s.length() != goal.length()) {
			return false;
		}
		
		int i = 0, j = 0;
		int count = 0;
		
		search :
		while(i < s.length() && j < goal.length()) {
			if(s.charAt(i) != goal.charAt(j)) {
				s = changeString(s);
				i = 0; j = 0;
				count++;
				
				if(count >= s.length()) {
					break;
				}
				
				continue search;
			}
			else {
				i++;
				j++;
			}
		}
		
		return (count >= s.length()) ? false : true;
    }

	private static String changeString(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(1));
		sb.append(s.charAt(0));
		return sb.toString();
	} 
}
