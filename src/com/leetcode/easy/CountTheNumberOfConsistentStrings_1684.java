package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class CountTheNumberOfConsistentStrings_1684 {

	public static void main(String[] args) {
		String allowed = "abc";
		String words[] = {"a","b","c","ab","ac","bc","abc"};
		
		System.out.println(countConsistentStrings(allowed, words));
	}
	
	public static int countConsistentStrings(String allowed, String[] words) {
		int count = 0;
		
		List<Character> list = new ArrayList<>();
		for(char c : allowed.toCharArray()) {
			list.add(c);
		}
		
		for(String s : words) {
			boolean flag = true;
			for(char c : s.toCharArray()) {
				if(!list.contains(c)) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				count++;
			}
		}
		
		return count;
    }

}
