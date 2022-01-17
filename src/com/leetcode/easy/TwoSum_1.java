package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

	public static void main(String[] args) {
		
	}
	
	// Brute Force
	// Time complexity : O(n^2)
	// Space complexity : O(1)
	public int[] twoSum(int[] nums, int target) {
	    for(int i=0; i<nums.length; i++) {
	        for(int j=i+1; j<nums.length; j++) {
	            if(nums[i] + nums[j] == target) {
	                return new int[] {i, j};
	            }
	        }
	    }
	    
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	
	// Memoization
	public int[] twoSum(int[] nums, int target, int target2) {
	    Map<Integer, Integer> map = new HashMap<>();
	    
	    for(int i=0; i<nums.length; i++) {
	        int complement = target - nums[i];
	        
	        if(map.containsKey(complement)) {
	        	return new int[] {i, map.get(complement)};
	        }
	        
	        map.put(nums[i], i);
	    }
	    
	    throw new IllegalArgumentException("No two sum solution");
	}

}
