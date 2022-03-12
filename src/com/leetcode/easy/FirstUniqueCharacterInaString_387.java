package com.leetcode.easy;

public class FirstUniqueCharacterInaString_387 {

	public static void main(String[] args) {
		// String s = "leetcode";
		String s = "loveleetcode";
		
		System.out.println(firstUniqChar(s));
	}
	
	
	public static int firstUniqChar(String s) {
		int count[] = new int[26];
		
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	count[c-'a']++;
        }
        
        // System.out.println("count = "+Arrays.toString(count));
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	
        	if(count[c-'a'] == 1) {
        		return i;
        	}
        }
        
        return -1;
    }
	
	
//	public static int firstUniqChar(String s) {
//		HashMap<Character, Integer> map = new HashMap<>();
//		
//        for(int i = 0; i < s.length(); i++) {
//        	char c = s.charAt(i);
//        	map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        
//        for(int i = 0; i < s.length(); i++) {
//        	char c = s.charAt(i);
//        	
//        	if(map.get(c) == 1) {
//        		return i;
//        	}
//        }
//        
//        return -1;
//    }

}
