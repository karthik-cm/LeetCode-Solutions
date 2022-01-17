package com.leetcode.easy;

import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray_1464 {

	public static void main(String[] args) {
		int nums[] = {3,4,5,2};
		System.out.println(maxProduct(nums));
	}
	
	
	public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int last = nums[nums.length-1];
        int lastButOne = nums[nums.length-2];
        return (last-1) * (lastButOne-1);
    }

}
