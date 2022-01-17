package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain_1048 {
	
	public static void main(String[] args) {
		String words[] = {"a","b","ba","bca","bda","bdca"};
		System.out.println(longestStrChain(words));
	}
	
	public static int longestStrChain(String[] words) {
		int len = words.length;
	    if(len <= 1) return len;
	    Arrays.sort(words, (w1, w2) -> Integer.compare(w1.length(), w2.length()));
	    
	    Map<String, Integer> map = new HashMap<>();
	    int maxLen = 1;
	    
	    for(String word : words) {
	        int chainLen = 1;
	        for (int j=0; j<word.length(); j++) {
	            String newStr = word.substring(0, j) + word.substring(j+1);
	            chainLen = Math.max(chainLen, map.getOrDefault(newStr, 0) +1);
	        }
	        
	        map.put(word, chainLen);
	        maxLen = Math.max(maxLen, chainLen);
	    }
	    
	    return maxLen;
	}
    
    
    
	
	/*private static HashMap<String,Integer> map = new HashMap<>();
    private static HashSet<String> set = new HashSet<>();
    
    
    public static int longestStrChain(String[] words) {
        int count = 0;
        for(String str : words) {
            set.add(str);
        }
        for(String str : words) {
            count = Math.max(count, dfs(str));
        }
        return count;
    }
    
    private static int dfs(String str) {
        if(str.length() == 0 || set.contains(str) == false)
        	return 0;
        
        if(map.get(str) != null)
        	return map.get(str);
        
        int temp = 0;
        for(int i=0; i<str.length(); i++) {
            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(i);
            temp = Math.max(temp, 1+dfs(sb.toString()));
        }
        
        map.put(str, temp);
        return temp;
    }*/

}
