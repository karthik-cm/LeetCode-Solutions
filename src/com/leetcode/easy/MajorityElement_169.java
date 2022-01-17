package com.leetcode.easy;

import java.util.Map;
import java.util.TreeMap;

public class MajorityElement_169 {
	
	public static void main(String[] args) {
		int nums[] = {3,2,3};
		System.out.println(majorityElement(nums));
	}
	
	public static int majorityElement(int[] nums) {
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
    }
}
