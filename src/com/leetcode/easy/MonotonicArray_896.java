package com.leetcode.easy;

public class MonotonicArray_896 {

	public static void main(String[] args) {
		
	}
	
	public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = (nums[nums.length - 1] >= nums[0]) ? true : false;
        int curr = nums[0];
        int next;
        
        for(int i=1; i<nums.length; i++){
            next = nums[i];
            
            if(isIncreasing && next<curr){
            	return false;
            }
            else if(!isIncreasing && next>curr){
            	return false;
            }
               
            curr = next;
        }
        
        return true;
    }

}
