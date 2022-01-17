package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII_219 {

	public static void main(String[] args) {
		
	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			int curr = nums[i];
			
			if(!map.containsKey(curr)) {
				map.put(curr, i);
			}
			else {
				int newValue = Math.abs(map.get(curr) - i);
				if(newValue <= k) {
					return true;
				}
				map.put(curr, newValue);
			}
		}
		
		return false;
    }

}
