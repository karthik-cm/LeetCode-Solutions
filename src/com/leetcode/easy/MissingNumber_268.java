package com.leetcode.easy;

public class MissingNumber_268 {

	public static void main(String[] args) {
		
	}
	
	
	// Sorting 
	// TC = O(nlogn), SC = O(1)
	/*public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != i) {
				return i;
			}
		}
		
		return nums.length;
    }*/
	
	
	// HashMap 
	// TC = O(n), SC = O(n)
	/*public int missingNumber(int[] nums) {
		int len = nums.length;
		HashSet<Integer> set = new HashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		
		for(int i = 0; i < len + 1; i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		
		return -1;
    }*/
	
	
	// Guass Formula
	// TC = O(n), SC = O(1)
	public int missingNumber(int[] nums) {
		int len = nums.length;
		
		int expectedSum = (len *(len + 1)) / 2;
		
		int actualSum = 0;
		for(int num : nums) {
			actualSum += num;
		}
		
		return expectedSum - actualSum;
	}

}
