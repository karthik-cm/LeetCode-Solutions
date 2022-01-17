package com.leetcode.medium;

import java.util.Arrays;

public class ThreeSumClosest_16 {

	public static void main(String[] args) {
		int nums[] = {-1, 2, 1, -4};
		int target = 1;
		
		System.out.println(threeSumClosest(nums, target));
	}

	
	public static int threeSumClosest(int[] nums, int target) {
		int diff = Integer.MAX_VALUE;
		int len = nums.length;
		
		Arrays.sort(nums);
		
		// [-4, -1, 1, 2]  ->  1
		for(int i=0; i<len && diff!=0; i++) {
			int low = i + 1;
			int high = len - 1;
			
			while(low < high) {
				int sum = nums[i] + nums[low] + nums[high];
				
				if(Math.abs(target - sum) < Math.abs(diff)) {
					diff = target - sum;
				}
				if(sum < target) {
					low++;
				}
				else {
					high--;
				}
			}
		}
		
		return target - diff;
	}
}
