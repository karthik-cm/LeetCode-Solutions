package com.leetcode.medium;

public class MaximumXorOfTwoNumbersInAnArray_421 {

	public static void main(String[] args) {
		int[] nums = {3,10,5,25,2,8};
		
		System.out.println(findMaximumXOR(nums));
		
		
		System.out.println(42 ^ 63);
	}
	
	
	public static int findMaximumXOR(int[] nums) {
        int max = 0;
        
        for(int i = 0; i < nums.length; i++) {
        	
        	for(int j = i+1; j < nums.length; j++) {
        		
        		if((nums[i] ^ nums[j]) > max) {
        			max = nums[i] ^ nums[j];
        		}
        		
            }
        }
        
        return max;
    }

}
