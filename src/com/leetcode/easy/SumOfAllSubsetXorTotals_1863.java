package com.leetcode.easy;

public class SumOfAllSubsetXorTotals_1863 {

	public static void main(String[] args) {
		// int[] nums = {1,3};
		int[] nums = {5, 1, 6};
		
		System.out.println(subsetXORSum(nums));
	}

	
	
	private static int sum;
    
    public static int subsetXORSum(int[] nums) {
        sum = 0;
        backtrack(nums, 0, 0);
        return sum;
    }
    
    private static void backtrack(int[] nums, int index, int curr) {
        sum += curr;
        
        for(int i=index; i<nums.length; i++) {
            curr ^= nums[i];
            backtrack(nums, i+1, curr);
            curr ^= nums[i];
        }
    }

}
