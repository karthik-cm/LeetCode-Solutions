package com.leetcode.medium;

public class StringCompression_443 {

	public static void main(String[] args) {
		// ["a","a","b","b","c","c","c"]
		// ["a","2","b","2","c","3"]
		// a2b2c3 ==> 6
		
		char[] chars = {'a','a','a','b','b','a','a'};
		System.out.println(compress(chars));
	}
	
	public static int compress(char[] chars) {
		String s = "", lastChar = "";
		int charCount = 0;
		
		String cStr;
		boolean flag;
		
		for(char c : chars) {
			cStr = Character.toString(c);
			flag = false;
			
			if(lastChar.length() == 0) {
				flag = true;
			}
			else {
				if(lastChar.equals(cStr)) {
					charCount++;
				}
				else {
					if(charCount >= 2) {
						s += String.valueOf(charCount);
					}
					lastChar = "";
					charCount = 0;
					flag = true;
				}
			}
			
			if(flag) {
				s += c;
				lastChar = cStr;
				charCount++;
			}
		}
		
		if(charCount >= 2) {
			s += String.valueOf(charCount);
		}
		
		for(int i=0; i<s.length(); i++) {
			chars[i] = s.charAt(i); 
		}
		
        return s.length();
    }

}
