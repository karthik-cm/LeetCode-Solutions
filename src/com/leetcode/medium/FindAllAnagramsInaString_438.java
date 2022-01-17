package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsInaString_438 {

	public static void main(String[] args) {
		String s = "cbaebabacd", p = "abc";
		// String s = "baa", p = "aa";
		
		System.out.println(findAnagrams(s, p));
	}
	
	/*public static List<Integer> findAnagrams(String s, String p){
		int sLen = s.length();
        int pLen = p.length();
        
        List<Integer> finalList = new ArrayList<>();
        
        if(sLen < pLen)
        	return finalList;
        
        int[] required = new int[26]; // static representation for 'p'
        int[] current = new int[26]; // dynamic representation for n characters of 's'
        
        for(int i=0; i<pLen; i++){
            required[p.charAt(i)-'a']++; // assign 'p' content
            current[s.charAt(i)-'a']++; // assign first n characters from 's'
        }
        
        for(int i=pLen; i<sLen; i++){
            if(Arrays.equals( required , current )) // check if both representations look similar
                finalList.add(i-pLen); // if yes add that index
            
            current[s.charAt(i-pLen)-'a']--; // decrement least recent character count in current
            current[s.charAt(i)-'a']++; // increment next character count in current
        }
        
        if(Arrays.equals(required , current))
            finalList.add(sLen-pLen); // final n characters string check
            
        return finalList;
	}*/
	
	public static List<Integer> findAnagrams(String s, String p) {
		int slen = s.length();
		int plen = p.length();
		
		if(slen == 0 || plen == 0 || slen < plen) {
			return Collections.emptyList();
		}
		
		List<Integer> list = new ArrayList<>();
		
		Map<Character, Integer> map = new HashMap<>();
		for(char c : p.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i=0; i<slen; i++) {
			Map<Character, Integer> tempMap = new HashMap<>(map);
			
			for(int j=i; j<i+plen && j<slen; j++) {
				char c = s.charAt(j);
				
				if(tempMap.containsKey(c)) {
					if(tempMap.get(c) - 1 == 0) {
						tempMap.remove(c);
					}
					else {
						tempMap.put(c, tempMap.get(c) - 1);
					}
						
					if(tempMap.size() == 0 && !list.contains(i)) {
						list.add(i);
					}
				}
				else {
					break;
				}
			}
		}
		
		return list;
    }
	
	/*public static List<Integer> findAnagrams(String s, String p) {
		int slen = s.length();
		int plen = p.length();
		
		if(slen == 0 || plen == 0 || slen < plen) {
			return Collections.emptyList();
		}
		
		List<Integer> list = new ArrayList<>();
		
		List<Character> pList = new LinkedList<>();
		for(char c : p.toCharArray()) {
			pList.add(c);
		}
		
		for(int i=0; i<slen; i++) {
			List<Character> tempList = new LinkedList<>(pList);
			
			for(int j=i; j<i+plen && j<slen; j++) {
				char c = s.charAt(j);
				
				if(tempList.contains(c)) {
					tempList.remove(Character.valueOf(c));
					
					if(tempList.size() == 0 && !list.contains(i)) {
						list.add(i);
					}
				}
				else {
					break;
				}
			}
		}
		
		return list;
    }*/

}
