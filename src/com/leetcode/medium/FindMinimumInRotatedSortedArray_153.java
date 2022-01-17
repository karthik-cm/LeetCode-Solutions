package com.leetcode.medium;

import java.util.Arrays;

public class FindMinimumInRotatedSortedArray_153 {

	public static void main(String[] args) {
		
	}
	
	
	public static int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
