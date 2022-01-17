package com.leetcode.easy;

import java.util.Arrays;

public class ContainsDuplicate_217 {

	public static void main(String[] args) {
		
	}
	
	// Using HashSets
	/*public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int n : nums){
            if(!set.contains(n)){
                set.add(n);
            }
            else{
                return true;
            }
        }
        
        return false;
    }*/
	
	
	public static boolean containsDuplicate(int[] nums) {
		Arrays.parallelSort(nums);
		int prev = nums[0];
		
        for(int i=1; i<nums.length; i++){
        	int curr = nums[i];
        	
        	if(prev == curr) {
        		return true;
        	}
        	
        	prev = curr;
        }
        
        return false;
    }

}
