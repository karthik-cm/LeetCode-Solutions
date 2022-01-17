package com.leetcode.easy;

public class RemoveDuplicatesFromSortedArray_26 {

	public static void main(String[] args) {
		int nums[] = {1,1,2};
		
		System.out.println(removeDuplicates(nums));
	}
	
	public static int removeDuplicates(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		
		int count = 1;
		
		for(int i=1; i<nums.length; i++){
			int currVal = nums[i];
			
			if(currVal != nums[count-1]){
				nums[count] = currVal;
				count++;
			}
        }
		
		return count;
    }
	
}
