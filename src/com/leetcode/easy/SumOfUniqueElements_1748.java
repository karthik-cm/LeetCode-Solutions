package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements_1748 {

	public static void main(String[] args) {
		int nums[] = {1,2,3,2};
		System.out.println(sumOfUnique(nums));
	}
	
	public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1) {
            	sum += entry.getKey();
            }
        }
        
        return sum;
    }

}
