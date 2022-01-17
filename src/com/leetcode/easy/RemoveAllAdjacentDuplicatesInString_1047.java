package com.leetcode.easy;

public class RemoveAllAdjacentDuplicatesInString_1047 {
	/*You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

	We repeatedly make duplicate removals on s until we no longer can.

	Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique */
	
	
	public static void main(String[] args) {
		String s = "azxxzy";
		System.out.println(removeDuplicates(s));
	}
	
	public static String removeDuplicates(String s) {
        
		if(s != null && s.length() > 0) {
			char currChar = 0, nextChar = 0;
			
			for(int i=0; i<s.length(); i++) {
				if(i != 0) {
					nextChar = s.charAt(i);
					if(currChar == nextChar) {
						String currValue = String.valueOf(currChar) + String.valueOf(nextChar);
						s = s.replace(currValue, "");
						i = -1;
					}
					
					currChar = nextChar;
				}
				else if(i == 0){
					currChar = s.charAt(0);
				}
			}
			
		}
		
		return s;
    }
	

}
