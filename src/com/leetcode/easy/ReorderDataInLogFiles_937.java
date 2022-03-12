package com.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderDataInLogFiles_937 {

	public static void main(String[] args) {
		String a = "abc def ghi jkl";
		System.out.println(Arrays.toString(a.split(" ", 2)));
	}
	
	
	
	// Time Complexity = O(M NlogN)
	// Space Complexity = O(M logN)
	public String[] reorderLogFiles(String[] logs) {
		
		// Comparator idea - custom sorting
		// if 1  => swap
		// if -1 => no swap
		
		
		Comparator<String> comparator = new Comparator<String>() {
			
			@Override
			public int compare(String log1, String log2) {
				// Split the identifier from the contents of the log
				String logArr1[] = log1.split(" ", 2); // [identifier, contents]
				String logArr2[] = log2.split(" ", 2);
				
				boolean isDigit1 = Character.isDigit(logArr1[1].charAt(0));
				boolean isDigit2 = Character.isDigit(logArr2[1].charAt(0));
				
				
				// case 1 : both are letter logs
				if(!isDigit1 && !isDigit2) {
					int cmp = logArr1[1].compareTo(logArr2[1]);
					
					if(cmp == 0) {
						return logArr1[0].compareTo(logArr2[0]);
					}
					else {
						return cmp;
					}
				}
				else if(!isDigit1 && isDigit2) { // case 2 : letter log & digit log
					return -1;
				}
				else if(isDigit1 && !isDigit2) { // case 3 : digit log & letter log
					return 1;
				}
				else{
					return 0;
				}
				
			}
		};
		
		
		
		Arrays.sort(logs, comparator);
		
		return logs;
    }

}
