package com.leetcode.medium;

import java.util.Arrays;

public class RotateArray_189 {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		
		rotate2(nums, k);
	}
	
	public static void rotate(int[] nums, int k) {
		int partArr[] = new int[k], count = 0;
		for(int i=nums.length-k; i<nums.length; i++) {
			partArr[count] = nums[i];
			count++;
		}
		
		int rotNums[] = new int[nums.length];
		
		// {1,2,3,4,5,6,7};
		
		System.arraycopy(partArr, 0, rotNums, 0, partArr.length);
		System.arraycopy(nums, 0, rotNums, k, nums.length-k);
		nums = rotNums;
    }
	
	public static void rotate2(int[] nums, int k) {
		int[] arr = new int[nums.length];
	    
		for(int i=0; i<nums.length; i++) {
	    	arr[(i+k) % nums.length] = nums[i];
	    }
	    
	    for(int i=0; i<nums.length; i++) {
	    	nums[i] = arr[i];
	    }
	    
	    System.out.println(Arrays.toString(nums));
	}
	
}
