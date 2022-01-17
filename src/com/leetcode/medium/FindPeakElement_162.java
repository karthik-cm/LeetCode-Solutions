package com.leetcode.medium;

public class FindPeakElement_162 {

	public static void main(String[] args) {
		
	}
	
	
	public static int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE; 
        int peak = 0;
        
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
                peak = i;
            }
        }
        
        return peak;
    }

}
