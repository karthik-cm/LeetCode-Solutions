package com.leetcode.easy;

public class MaxConsecutiveOnes_485 {

	public static void main(String[] args) {
		int nums[] = {1,1,0,1,1,1,1};
		System.out.println(findMaxConsecutiveOnes(nums));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
		if(nums != null && nums.length > 0) {
			int maxCount = 0;
			int count = 0;
			
			for(int i=0; i<nums.length; i++) {
				if(nums[i] == 1) {
					count++;
				}
				else {
					maxCount = Math.max(count, maxCount);
					count = 0;
				}
			}
			
			maxCount = Math.max(count, maxCount);
			
			return maxCount;
		}
		
		return 0;
    }

}
