package com.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsOfaPhoneNumber_17 {

	public static void main(String[] args) {
		String digits = "23";
		
		System.out.println(letterCombinations(digits));
	}
	
	
	// BFS
	public static List<String> letterCombinations(String digits) {
		LinkedList<String> result = new LinkedList<>(); // acts as a Queue here
		
		if(digits == null || digits.length() == 0) {
			return result;
		}
		
		result.add("");
		
		String charmap[] = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		
		for(int i=0; i<digits.length(); i++) {
			char num = digits.charAt(i);
			int index = Character.getNumericValue(num); // get number
			
			while(result.peek().length() == i) {
				String head = result.remove(); // head element string
				
				for(char c : charmap[index].toCharArray()) {
					result.add(head + c);
				}
			}
		}
		
		return result;
	}

}
