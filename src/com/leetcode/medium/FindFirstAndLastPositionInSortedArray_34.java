package com.leetcode.medium;

import java.util.Arrays;

public class FindFirstAndLastPositionInSortedArray_34 {

	public static void main(String[] args) {
		// int nums[] = {5,7,7,8,8,10};
		int nums[] = {1};
		int target = 1;
		
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}
	
	public static int[] searchRange(int[] nums, int target) {
		int l = 0;
		int r = nums.length-1;
		
		boolean isLeftFound = false;
		boolean isRightFound = false;
		
		for(int i=0; i<nums.length-1 && l<r; i++) {
			if(!isLeftFound) {
				if(nums[l] != target) {
					l++;
				}
				else {
					isLeftFound = true;
				}
			}
			
			if(!isRightFound) {
				if(nums[r] != target) {
					r--;
				}
				else {
					isRightFound = true;
				}
			}
		}
		
		
		if(nums[l] == target && nums[r] == target) {
			return new int[] {l, r};
		}
		
		return new int[] {-1, -1};
    }

}
