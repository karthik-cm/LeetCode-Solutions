package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum_15 {

	public static void main(String[] args) {
		int nums[] = {-1,0,1,2,-1,-4};
		
		System.out.println(threeSum(nums));
	}
	
	
	// Time complexity : O(n^2)
	// Space complexity : O(n)
	
	public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3) {
        	return new ArrayList<>(set);
        }
        
        Arrays.sort(nums);
        
        // [-1,0,1,2,-1,-4]
        // [-4,-1,-1,0,1,2]
        
        for(int i = 0; i < nums.length-1; i++){
           int low = i+1;
           int high = nums.length-1;
           
           while(low < high){
        	   int sum = nums[i] + nums[low] + nums[high];
        	   
               if(sum == 0) {
            	   set.add(Arrays.asList(nums[i], nums[low], nums[high]));
            	   low++;
            	   high--;
               }
               else if(sum > 0) {
            	   high--;
               }
               else {
            	   low++;
               }
            }
        }
        
        return new ArrayList<>(set);
    }

}