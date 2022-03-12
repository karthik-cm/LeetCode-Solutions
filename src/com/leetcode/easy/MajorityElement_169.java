package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_169 {
	
	public static void main(String[] args) {
		int nums[] = {3,2,3};
		
		System.out.println(majorityElement(nums));
	}
	
	
	// TC - O(n)
	// SC - O(n)
	public static int majorityElement(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		
		int maxKey = Integer.MIN_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			if(entry.getValue() > maxValue) {
				maxKey = entry.getKey();
				maxValue = entry.getValue();
			}
		}
		
		return maxKey;
    }
	
	
	
	/*public static int majorityElement(int[] nums) {
		if(nums.length > 0) {
			Map<Integer, Integer> map = new TreeMap<>();
			
			for(int n : nums) {
				map.put(n, map.getOrDefault(n, 0)+1);
			}
			
			int highValue = Integer.MIN_VALUE;
			int highKey = Integer.MIN_VALUE;
			
			for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
				if(entry.getValue() > highValue) {
					highValue = entry.getValue();
					highKey = entry.getKey();
				}
			}
			
			return highKey;
		}
		
		return -1;
    }*/
}
