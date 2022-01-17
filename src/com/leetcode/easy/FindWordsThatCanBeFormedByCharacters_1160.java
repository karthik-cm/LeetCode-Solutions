package com.leetcode.easy;

public class FindWordsThatCanBeFormedByCharacters_1160 {

	public static void main(String[] args) {
		String words[] = {"cat","bt","hat","tree"};
		String chars = "atach";
		
		System.out.println(countCharacters(words, chars));
	}
	
	// Solve by Frequency Count method
	public static int countCharacters(String[] words, String chars) {
        int count = 0;
        
        int charCount[] = count(chars);
        
        search : 
        for(String word : words){
            int wordCount[] = count(word);
            
            for(int i=0; i<26; i++){
                if(wordCount[i] > charCount[i]){
                    continue search;
                }
            }
            
            count += word.length();
        }
        
        return count;
    }
	
	private static int[] count(String s) {
		int count[] = new int[26];
		
		for(char c : s.toCharArray()) {
			count[c-'a']++; 
		}
		
		return count;
	}

}
