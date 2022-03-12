package com.leetcode.easy;

public class RemoveElement_27 {

	public static void main(String[] args) {
		
	}
	
	
	public int removeElement(int[] nums, int val) {
        int index = 0;
        
        for(int num : nums){
            if(num != val){
                nums[index] = num;
                index++;
            }
        }
        
        return index;
    }

}
