package com.leetcode.easy;

import java.util.Arrays;

public class FindTheDifference_389 {

	public static void main(String[] args) {
		String s = "abcd";
		String t = "abcde";
		
		/*String s = "";
		String t = "y";*/
		
		System.out.println(findTheDifference(s, t));
		
	}
	
	public static char findTheDifference(String s, String t) {
        int count[] = new int[26];
        
        for(char c : s.toCharArray()) {
        	count[c-'a']++;
        }
        
        for(char c : t.toCharArray()) {
        	count[c-'a']--;
        }
        
        System.out.println(Arrays.toString(count));
        
        for(int i=0; i<26; i++) {
        	if(count[i] < 0) {
        		return (char)(i+'a');
        	}
        }
        
        return (char) 0;
    }
	
	
	/*public static char findTheDifference(String s, String t) {
        LinkedList<Character> list = new LinkedList<>();
        
        for(char c : t.toCharArray()) {
        	list.add(c);
        }
        
        for(char c : s.toCharArray()) {
        	if(list.contains(c)) {
        		list.remove(Character.valueOf(c));
        	}
        }
        
        return list.get(0);
    }*/
	
	
	/*public static char findTheDifference(String s, String t) {
        char sArr[] = s.toCharArray();
        Arrays.sort(sArr);
        
        char tArr[] = t.toCharArray();
        Arrays.sort(tArr);
        
        for(int i=0; i<sArr.length; i++) {
        	char cs = sArr[i];
        	char ct = tArr[i];
        	
        	if(cs != ct) {
        		return ct;
        	}
        }
        
        return t.charAt(t.length()-1);
    }*/

}
