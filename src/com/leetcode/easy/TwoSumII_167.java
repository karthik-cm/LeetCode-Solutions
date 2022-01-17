package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumII_167 {

	public static void main(String[] args) {
		int numbers[] = {2,7,11,15};
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}

	
	public static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<numbers.length; i++) {
			int complement = target - numbers[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement)+1, i+1};
			}
			
			map.put(numbers[i], i);
		}
		
		return new int[0];
    }
	
}
