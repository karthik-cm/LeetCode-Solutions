package com.leetcode.easy;

import java.util.Arrays;

public class CheckIfArrayIsSortedAndRotated_1752 {
	
	public static void main(String[] args) {
		int nums[] = {3,4,5,1,2};
		System.out.println(check(nums));
	}
	
	
	public static boolean check(int[] nums) {
		int len = nums.length;
		int rotnums[] = new int[len];
		System.arraycopy(nums, 0, rotnums, 0, nums.length);
		
		Arrays.sort(nums);
		
		int n = len;
		while(n > 0) {
			int nums2[] = new int[len];
			nums2[0] = nums[len-1];
			System.arraycopy(nums, 0, nums2, 1, len-1);
			n--;
			
			if(Arrays.equals(nums2, rotnums)) {
				return true;
			}
			
			nums = nums2;
		}
		
		return false;
    }
}
