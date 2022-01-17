package com.leetcode.easy;

import java.util.Map;
import java.util.TreeMap;

public class ShuffleString_1528 {

	public static void main(String[] args) {
		Map<Integer, Character> map = new TreeMap<>();
		map.put(1, 'b');
		map.put(10, 'c');
		map.put(0, 'a');
		
		System.out.println(map);
		
		
		String s = "codeleet";
		int indices[] = {4,5,6,7,0,2,1,3};
		
		System.out.println(restoreString(s, indices));
	}
	
	public static String restoreString(String s, int[] indices) {
		String restoredString = "";
		Map<Integer, Character> map = new TreeMap<>(); 
		
		for(int i=0; i<indices.length; i++) {
			char c = s.charAt(i);
			map.put(indices[i], c);
		}
		
		for(Map.Entry<Integer, Character> entry : map.entrySet()) {
			restoredString += entry.getValue();
		}
		
		return restoredString;
    }

}
