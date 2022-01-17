package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumErasureValue_1695 {

	public static void main(String[] args) {
		
	}
	
	public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        int ans = 0;
        int i = 0, j = 0;
        int currSum = 0;
        
        while(i<nums.length && j<nums.length){
            if(!set.contains(nums[j])){
                currSum += nums[j];
                set.add(nums[j]);
                j++;
                
                ans = Math.max(currSum, ans);
            }
            else{
                currSum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        
        return ans;
    }

}
