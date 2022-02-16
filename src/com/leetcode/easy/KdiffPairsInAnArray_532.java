package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairsInAnArray_532 {

	public static void main(String[] args) {
		
	}
	
	
    public int findPairs(int[] nums, int k) {
    	int result = 0;

        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            
            if(k > 0 && counter.containsKey(key + k)) {
                result++;
            }
            else if (k == 0 && value > 1) {
                result++;
            }
        }
        
        return result;
    }

}
