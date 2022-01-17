package com.leetcode.medium;

import java.util.Arrays;

public class PartitionArrayIntoDisjointIntervals_915 {

	public static void main(String[] args) {
		int nums[] = {5,0,3,8,6};
		System.out.println(Arrays.toString(nums));
		System.out.println(partitionDisjoint(nums));
	}

	
	// Intuition
	// Instead of checking whether all(L <= R for L in left for R in right), let's check whether max(left) <= min(right)
	public static int partitionDisjoint(int[] nums) {
		int len = nums.length;
        int maxleft[] = new int[len]; // MAX LEFT
        int minright[] = new int[len]; // MIN RIGHT

        int m = nums[0];
        for(int i=0; i<len; i++) {
            m = Math.max(m, nums[i]);
            maxleft[i] = m;
        }

        m = nums[len-1];
        for(int i=len-1; i>=0; i--) {
            m = Math.min(m, nums[i]);
            minright[i] = m;
        }
        
        for(int i=1; i<len; i++) {
            if(maxleft[i-1] <= minright[i]) {
            	return i;
            }
        }

        return -1;
    }
}
