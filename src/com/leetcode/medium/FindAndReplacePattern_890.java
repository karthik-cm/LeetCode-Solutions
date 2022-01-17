package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAndReplacePattern_890 {

	public static void main(String[] args) {
		String words[] = {"abc","deq","mee","aqq","dkd","ccc"};
		String pattern = "abb";
		
		// String words[] = {"a","b","c"};
		// String pattern = "a";
		
		System.out.println(findAndReplacePattern(words, pattern));
		
		
		
		/*List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		
		System.out.println(list1.equals(list2));*/
	}
	
	
	public static List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> list = new ArrayList<>();
		
		for(String word: words) {
			if(match(word, pattern)) {
				list.add(word);
			}
		}
        return list;
 	}

	public static boolean match(String word, String pattern) {
	    Map<Character, Character> map1 = new HashMap<>();
	    Map<Character, Character> map2 = new HashMap<>();
	
	    // abc, abb
	    for(int i=0; i<word.length(); i++) {
	        char w = word.charAt(i);
	        char p = pattern.charAt(i);
	        
	        if(!map1.containsKey(w))
	        	map1.put(w, p);
	        
	        if(!map2.containsKey(p))
	        	map2.put(p, w);
	        
	        if(map1.get(w) != p || map2.get(p) != w) {
	            return false;
	        }
	    }
	
	    return true;
	}
	
	
	
	
	
	/*public static List<String> findAndReplacePattern(String[] words, String pattern) {
		List<String> list = new ArrayList<>();
		
		Map<Character, Integer> patternMap = new LinkedHashMap<>();
		for(Character c : pattern.toCharArray()) {
			patternMap.put(c, patternMap.getOrDefault(c, 0)+1);
		}
		List<Integer> patternList = new ArrayList<>(patternMap.values());
		System.out.println("patternList : "+patternList);
		
		Map<Character, Integer> wordMap = new LinkedHashMap<>();
		
		for(String word : words) {
			System.out.println("word = "+word);
			
			for(Character c : word.toCharArray()) {
				wordMap.put(c, wordMap.getOrDefault(c, 0)+1);
			}
			List<Integer> wordList = new ArrayList<>(wordMap.values());
			System.out.println("wordList : "+wordList);
			
			if(patternMap.size() == wordMap.size()) {
				if(patternList.equals(wordList)) {
					list.add(word);
				}
			}
			
			wordMap.clear();
		}
		
		return list;
	}*/

}
