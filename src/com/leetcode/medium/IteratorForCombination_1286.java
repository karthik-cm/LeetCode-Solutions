package com.leetcode.medium;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class IteratorForCombination_1286 {

	public static void main(String[] args) {
		String str = "abc";
		int size = 2;
		System.out.println(combinations(str, size));
	}
	
	// Backtracking
	public static Set<String> combinations(String str, int size){
		Set<String> set = new TreeSet<>();
		StringBuilder sb = new StringBuilder();
		backtrack(0, sb, str, size, set);
		
		// Set to Array
		String arr[] = set.toArray(new String[set.size()]);
		System.out.println(Arrays.toString(arr));
		
		return set;
	}


	private static void backtrack(int index, StringBuilder sb, String str, int size, Set<String> set) {
		if(sb.length() == size) {
			set.add(sb.toString());
			return;
		}
		
		for(int i=index; i<str.length(); i++) {
			sb.append(str.charAt(i));
			backtrack(i+1, sb, str, size, set);
			sb.deleteCharAt(sb.length()-1);
		}
	}

}


class CombinationIterator {
    Set<String> set;
    int index = -1;
    String arr[];

    public CombinationIterator(String characters, int combinationLength) {
        set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
		backtrack(0, sb, characters, combinationLength, set);
        arr = set.toArray(new String[set.size()]);
    }
    
    private void backtrack(int index, StringBuilder sb, String str, int size, Set<String> set) {
		if(sb.length() == size) {
			set.add(sb.toString());
			return;
		}
		
		for(int i=index; i<str.length(); i++) {
			sb.append(str.charAt(i));
			backtrack(i+1, sb, str, size, set);
			sb.deleteCharAt(sb.length()-1);
		}
	}
    
    
    public String next() {
        if(index < arr.length-1){
            index++;
            return arr[index];
        }
        
        return null;
    }
    
    public boolean hasNext() {
        return index < arr.length-1;
    }
}
