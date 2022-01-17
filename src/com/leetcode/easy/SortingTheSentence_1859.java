package com.leetcode.easy;

import java.util.Map;
import java.util.TreeMap;

public class SortingTheSentence_1859 {

	public static void main(String[] args) {
		String s = "is2 sentence4 This1 a3";
		System.out.println(sortSentence2(s));
	}
	
	public static String sortSentence(String s) {
		if(s != null && s.length() > 0) {
			TreeMap<Integer, String> map = new TreeMap<>();
			
			int index = 0; String word = "";
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				
				if(Character.isWhitespace(c)) {
					map.put(index, word);
					index = 0;
					word = "";
				}
				else {
					if(Character.isDigit(c)) {
						index = (int) c;
					}
					else {
						word += c;
					}
				}
			}
			map.put(index, word);
			
			String sentence = "";
			for(Map.Entry<Integer, String> entry : map.entrySet()) {
				sentence += entry.getValue() +" ";
			}
			
			return sentence.trim();
        }
		
		return "";
    }
	
	
	public static String sortSentence2(String s) {
		TreeMap<Integer, String> map = new TreeMap<>();
		
		String sArr[] = s.split(" ");
		int index = 0; String word = "";

		for(String a : sArr) {
			int len = a.length();
			char c = a.charAt(len-1);
			index = Integer.parseInt(Character.toString(c));
			word = a.substring(0, len-1);
			map.put(index, word);
		}
		
		String sentence = "";
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			sentence += entry.getValue() +" ";
		}
		
		return sentence.trim();
    }

}
