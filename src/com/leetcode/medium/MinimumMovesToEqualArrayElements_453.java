package com.leetcode.medium;

public class MinimumMovesToEqualArrayElements_453 {

	public static void main(String[] args) {
		
	}
	

	// T.C = O(N)
	// S.C = O(1)
	public int minMoves(int[] nums) {
        int moves = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i] - min;
        }
        
        return moves;
    }

}
