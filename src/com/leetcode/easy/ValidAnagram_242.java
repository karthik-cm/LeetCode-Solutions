package com.leetcode.easy;

public class ValidAnagram_242 {
	// Anagram is a word formed from rearranging the main word
	// anagram - nagaram
	
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		System.out.println(isAnagram(s, t));
		
		
		
		int index = 'z'-'z';
		System.out.println(index);
	}

	
	// Solution #1 - HashMap
	// The hash table should handle all unicode characters
	
	/*private boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char cs = s.charAt(i);
			char ct = t.charAt(i);
			
			map.put(cs, map.getOrDefault(cs, 0)+1);
			map.put(ct, map.getOrDefault(cs, 0)-1);
		}
		
		List<Integer> list = new ArrayList<>(map.values());
		
		for(int i : list) {
			if(i != 0) {
				return false;
			}
		}
		
		return true;
    }*/
	
	
	// Solution #2 - Sorting
	/*private static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		char sArr[] = s.toCharArray();
		char tArr[] = t.toCharArray();
		
		Arrays.parallelSort(sArr);
		Arrays.parallelSort(tArr);
		
		return Arrays.equals(sArr, tArr);
	}*/
	
	
	
	
	// Solution #3 - Array Increment Decrement
	private static boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		int counter[] = new int[26];
		for(int i=0; i<s.length(); i++) {
			counter[s.charAt(i)-'a']++;
			counter[t.charAt(i)-'a']--;
		}
		
		for(int i : counter) {
			if(i != 0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	
}
