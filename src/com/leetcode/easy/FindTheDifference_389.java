package com.leetcode.easy;

public class FindTheDifference_389 {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		
		/*String s = "";
		String t = "y";*/
		
		System.out.println(findTheDifference(s, t));
	}
	
	public static char findTheDifference(String s, String t) {
		int count[] = new int[26];
		
		for(int i=0; i<t.length(); i++) {
			char c = t.charAt(i);
			count[c-'a']++;
		}
		
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			count[c-'a']--;
		}
		
		for(int i=0; i<count.length; i++) {
			if(count[i] > 0) {
				return (char) (i+'a');
			}
		}
		
		return (char) (0+'a');
    }

}
