package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Combinaton_77 {

	public static void main(String[] args) {
		int n = 4, k = 2;
		
		System.out.println(combine(n, k));
	}

	
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> finalList = new ArrayList<>();
		backtrack(n, k, 1, finalList, new ArrayList<Integer>());
		return finalList;
    }

	
	// backtracking
	private static void backtrack(int n, int k, int start, List<List<Integer>> finalList, ArrayList<Integer> list) {
		if(k == 0) {
			finalList.add(new ArrayList<>(list));
			return;
		}
		
		for(int i=start; i<=n; i++) {
			list.add(i);
			backtrack(n, k-1, i+1, finalList, list);
			list.remove(list.size()-1);
		}
	}
	
}
