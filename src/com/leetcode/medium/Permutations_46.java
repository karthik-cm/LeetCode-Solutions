package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations_46 {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(permute(nums));
	}
	
	
	// Backtracking
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		backtrack(nums, new ArrayList<Integer>(), result);
		return result;
    }

	private static void backtrack(int[] nums, ArrayList<Integer> list, List<List<Integer>> result) {
		if(list.size() == nums.length) {
			result.add(new ArrayList<>(list));
		}
		
		for(int i=0; i<nums.length; i++) {
			if(list.contains(nums[i])) {
				continue;
			}
			
			list.add(nums[i]);
			backtrack(nums, list, result);
			list.remove(list.size()-1);
		}
	}
	
}
