package com.leetcode.medium;

import java.util.HashMap;

public class SubarraySumEqualsK_560 {

	public static void main(String[] args) {
		
	}
	
	
	// Brute Force
	// Time Complexity - O(N^2)
	// Space Complexity - O(1)
	/*public static int subarraySum(int[] nums, int k) {
        int result = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	int sum = 0;
        	
        	for(int j = i; j < nums.length; j++) {
        		sum += nums[j];
        		
        		if(sum == k) {
        			result++;
        		}
        	}
        }
        
        return result;
    }*/
	
	
	
	// HashMaps
	// Time Complexity - O(N)
	// Space Complexity - O(1)
	public int subarraySum(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            if(map.containsKey(sum - k)) {
                result += map.get(sum - k);
            }
            
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
	

}
