package com.leetcode.medium;

public class NextPermutation_31 {

	public static void main(String[] args) {
		
	}
	
	
	// 1. Brute Force
	// Find all the possible permutations for the given array and pick the next greatest one.
	// Time Complexity = O(N), Space Complexity = O(1)
	
	
	
	// 2. Single Pass Approach
	// >> Find the first decreasing element from the end of array.
	// >> Find the just next larger element to the element from Step #1
	// >> Reverse the later half
	public static void nextPermutation(int[] nums) {
		int len = nums.length;
		int i = len - 2;
		
		while(i >= 0 && nums[i + 1] <= nums[i]) {
			i--;
		}
		
		
		if(i >= 0) {
			int j = len - 1;
			
			while(nums[j] <= nums[i]) {
				j--;
			}
			
			swap(nums, i, j);
		}
		
		reverse(nums, i + 1);
    }


	private static void reverse(int[] nums, int start) {
		int i = start;
		int j = nums.length - 1;
		
		while(i < j) {
			swap(nums, i, j);
			
			i++;
			j--;
		}
	}


	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
