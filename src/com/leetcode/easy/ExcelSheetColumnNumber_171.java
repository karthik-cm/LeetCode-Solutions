package com.leetcode.easy;

public class ExcelSheetColumnNumber_171 {

	public static void main(String[] args) {
		
	}
	
	
	public int titleToNumber(String s) {
        int result = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            result = result * 26;
            
            // In Java, subtracting characters is subtracting ASCII values of characters
            result += (s.charAt(i) - 'A' + 1);
        }
        
        return result;
    }

}
