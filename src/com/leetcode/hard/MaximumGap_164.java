package com.leetcode.hard;

import java.util.Arrays;

public class MaximumGap_164 {

	public static void main(String[] args) {
		int nums[] = {1,3,100};
		System.out.println("max gap = "+maximumGap(nums));
	}
	
	public static int maximumGap(int[] nums) {
		if(nums.length < 2) {
			return 0;
		}
		
		Arrays.sort(nums);
		int maxGap = Integer.MIN_VALUE;
		for(int i=0; i<nums.length-1; i++) {
			int currVal = nums[i];
			int nextVal = nums[i+1];
			
			int diff = (currVal > nextVal) ? currVal-nextVal : nextVal-currVal;
			maxGap = Math.max(maxGap, diff);
		}
		
        return maxGap;
    }

}
