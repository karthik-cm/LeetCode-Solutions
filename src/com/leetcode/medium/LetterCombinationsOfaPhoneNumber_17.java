package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfaPhoneNumber_17 {

	public static void main(String[] args) {
		String digits = "23";
		
		System.out.println(letterCombinations(digits));
	}
	
	
	
	private static List<String> combinations = new ArrayList<>();
    private static Map<Character, String> letters = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    
    private static String phoneDigits;
    
    
    // Backtracking
    public static List<String> letterCombinations(String digits) {
        // If the input is empty, immediately return an empty answer array
        if (digits.length() == 0) {
            return combinations;
        }
        
        // Initiate backtracking with an empty path and starting index of 0
        phoneDigits = digits;
        backtrack(0, new StringBuilder());
        return combinations;
    }
    
    private static void backtrack(int index, StringBuilder path) {
        // If the path is the same length as digits, we have a complete combination
        if (path.length() == phoneDigits.length()) {
            combinations.add(path.toString());
            return; // Backtrack
        }
        
        // Get the letters that the current digit maps to, and loop through them
        String possibleLetters = letters.get(phoneDigits.charAt(index));
        
        for (char letter : possibleLetters.toCharArray()) {
            // Add the letter to our current path
            path.append(letter);
            
            // Move on to the next digit
            backtrack(index + 1, path);
            
            // Backtrack by removing the letter before moving onto the next
            path.deleteCharAt(path.length() - 1);
        }
    }
	
	
	
	
	// BFS
	/*public static List<String> letterCombinations(String digits) {
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
	}*/

}
