package com.leetcode.easy;

import java.util.HashMap;

public class SingleNumber_136 {
	/*
	Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
	Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
	*/
	
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,3,1};
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>(); // numb, count
		
		for(int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		}
		
		for(int i : nums) {
			if(map.get(i) == 1) {
				return i;
			}
		}
		
		return 0;
    }

}
