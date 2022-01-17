package com.leetcode.medium;

import java.util.Arrays;

public class KthLargestElementInAnArray_215 {

	public static void main(String[] args) {
		
	}
	
	public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
		return nums[nums.length-k];
    }

}
