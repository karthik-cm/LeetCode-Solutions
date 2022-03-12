package com.leetcode.easy;

public class MaximumSubarray_53 {

	public static void main(String[] args) {
		
	}
	
	
	public static int maxSubArray(int[] nums) {
		// trivial case
		if(nums.length == 1) {
			return nums[0];
		}
		
		int localSum = nums[0];
		int globalSum = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			localSum = Math.max(nums[i], localSum + nums[i]);
			
			if(localSum > globalSum) {
				globalSum = localSum;
			}
		}
		
		return globalSum;
    }

}
