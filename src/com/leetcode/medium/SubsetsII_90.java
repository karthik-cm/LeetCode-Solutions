package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII_90 {

	public static void main(String[] args) {
		int[] nums = {1,2,2};
		System.out.println(subsetsWithDup(nums));
	}
	
	
	// Backtracking
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(0, nums, new ArrayList<Integer>(), list);
		return list;
    }


	private static void backtrack(int start, int[] nums, ArrayList<Integer> temp, List<List<Integer>> list) {
		list.add(new ArrayList<>(temp));
		
		for(int i=start; i<nums.length; i++) {
			if(i > start && nums[i] == nums[i-1]) {
				continue;
			}
			
			temp.add(nums[i]);
			backtrack(i+1, nums, temp, list);
			temp.remove(temp.size()-1);
		}
	}

}
