package com.leetcode.hard;

public class FirstMissingPositive_41 {

	public static void main(String[] args) {
		// int nums[] = {1, 2, 3};
		int nums[] = {1, 2, 4};
		
		System.out.println(firstMissingPositive(nums));
		
		System.out.println(firstMissingPositive(nums, 0));
	}
	
	
	// O(N) & O(1) Solution
	public static int firstMissingPositive(int[] nums) {
        
		for(int i=0; i<nums.length; i++) {
            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i]) {
                swap(nums, i, nums[i]-1);
            }
        }
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
            	return i+1;
            }
        }
        
        return nums.length+1;
    }
    
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
    
    
    // O(N) && O(N) Solution
    public static int firstMissingPositive(int[] nums, int x) {
    	int len = nums.length;

    	boolean[] present = new boolean[len + 1];
    	
    	for(int i=0; i<len; i++) {
    		if(nums[i] > 0 && nums[i] <= len) {
    			present[nums[i]] = true;
    		}
    	}
    	
    	for(int i=1; i<=len; i++) {
    		if(!present[i]) {
    			return i;
    		}
    	}

    	return len + 1;
    }
}
