package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets_916 {

	public static void main(String[] args) {
		String words1[] = {"amazon","apple","facebook","google","leetcode"};
		String words2[] = {"ec","oc","ceo"};
		
		System.out.println(wordSubsets(words1, words2));
	}
	
    public static List<String> wordSubsets(String[] A, String[] B) {
        int[] bmax = count("");
        
        for(String b : B) {
            int[] bCount = count(b);
            
            for(int i=0; i<26; ++i) {
                bmax[i] = Math.max(bmax[i], bCount[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        search: for(String a : A) {
            		int[] aCount = count(a);
            		for(int i=0; i<26; ++i) {
            			if(aCount[i] < bmax[i]) {
            				continue search;
            			}
            		}
            		ans.add(a);
        		}

        return ans;
    }

    public static int[] count(String S) {
        int[] ans = new int[26];
        for(char c: S.toCharArray()) {
        	ans[c - 'a']++;
        }
        return ans;
    }
	
	
	
	/*public static List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> result = new ArrayList<>();
        
		List<Map<Character, Integer>> list = new ArrayList<>();
        for(String w : words2) {
        	list.add(getCharacterCount(w));
        }
        
        for(String w : words1) {
        	boolean flag = false;
        	Map<Character, Integer> map1 = getCharacterCount(w);
        	
        	for(Map<Character, Integer> map2 : list) {
        		for(Map.Entry<Character, Integer> entry : map2.entrySet()) {
        			char c = entry.getKey();
        			
        			if(!map1.containsKey(c) || !(map1.get(c) >= map2.get(c))) {
        				flag = true;
        				break;
        			}
        		}        		
        		
        		if(flag) {
        			break;
        		}
        	}
        	
        	if(!flag) {
        		result.add(w);
        	}
        }
        
        return result;
    }
	
	public static Map<Character, Integer> getCharacterCount(String s){
		Map<Character, Integer> map = new HashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		return map;
	}*/
	
}
