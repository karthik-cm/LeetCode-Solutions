package com.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ReverseWordsInString {

	// Medium - #151
	
	public static void main(String[] args) {
		String s = "    the    cmk        ";
		
		String arr[] = s.trim().replaceAll("[ ]+", " ").split(" ");
		List<String> list = Arrays.asList(arr);
		System.out.println(list);
		
		ListIterator<String> listItr = list.listIterator(list.size());
		StringBuilder sb = new StringBuilder();
		
		while(listItr.hasPrevious()) {
			sb.append(listItr.previous().trim()).append(" ");
		}
		
	}

	
}
