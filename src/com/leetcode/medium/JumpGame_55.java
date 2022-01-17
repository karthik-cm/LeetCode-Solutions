package com.leetcode.medium;

public class JumpGame_55 {
	
	public static void main(String[] args) {
		int nums[] = {2,3,1,1,4};
		System.out.println(canJump(nums));
	}
	
	// Intuition : Work backwards 
	public static boolean canJump(int[] nums) {
		int lastGoodIndexPosition = nums.length-1;
		
		for(int i=nums.length-1; i>=0; i--) {
			if(i + nums[i] >= lastGoodIndexPosition) {
				lastGoodIndexPosition = i;
			}
		}
		
		return lastGoodIndexPosition == 0;
	 }
}
