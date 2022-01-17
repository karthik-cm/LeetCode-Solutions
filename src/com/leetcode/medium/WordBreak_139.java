package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak_139 {

	public static void main(String[] args) {
		// String s = "leetcode";
		// List<String> wordDict = Arrays.asList("leet", "code");
		
		String s = "catsandog";
		List<String> wordDict = Arrays.asList("cats","dog","sand","and","cat");
		
		// String s = "aaaaaaa";
		// List<String> wordDict = Arrays.asList("aaaa", "aaa");
		
		// String s = "goalspecial";
		// List<String> wordDict = Arrays.asList("go","goal","goals","special");
		
		System.out.println(wordBreak(s, wordDict));
	}
	
	
	public static boolean wordBreak(String s, List<String> wordDict) {
        return wordBreakMemo(s, new HashSet<>(wordDict), 0, new Boolean[s.length()]);
    }

    private static boolean wordBreakMemo(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if(start == s.length()) {
            return true;
        }
        
        if(memo[start] != null) {
            return memo[start];
        }
        
        for(int end=start+1; end<=s.length(); end++) {
            if(wordDict.contains(s.substring(start, end)) && wordBreakMemo(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        
        return memo[start] = false;
    }
	
	
	
	
	/*public static boolean wordBreak(String s, List<String> wordDict) {
		if(s == null || s.length() == 0 || wordDict.size() == 0) {
			return false;
		}
		
		String s2 = "";
		for(String str : wordDict) {
			s2 += str;
		}
		
		if(s.equals(s2)) {
			return true;
		}
		
		
		List<String> list = new ArrayList<>();
		
		int i = 0;
		int j = i+1;
		
		while(j <= s.length()) {
			String subStr = s.substring(i, j);
			
			if(wordDict.contains(subStr)) {
				list.add(subStr);
				i = j;
			}
			else {
				for(int k=0; k<list.size(); k++) {
					String listStr = list.get(k) + subStr;
					
					if(wordDict.contains(listStr)) {
						list.remove(k);
						list.add(listStr);
					}
				}
			}
			
			j++;
		}
		
		System.out.println(list);
		
		s2 = "";
		for(String str : list) {
			s2 += str;
		}
		
		return s.equals(s2);
    }*/

}
