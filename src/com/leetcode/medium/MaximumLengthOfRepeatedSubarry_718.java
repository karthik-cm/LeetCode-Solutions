package com.leetcode.medium;

public class MaximumLengthOfRepeatedSubarry_718 {

	public static void main(String[] args) {
		// A: [1,2,3,2,1]
		// B: [3,2,1,4,7]
		
		int[] A = {1,2,3,2,1};
		int[] B = {3,2,1,4,7};
		System.out.println(findLength(A, B));
	}
	
	public static int findLength(int[] A, int[] B) {
		int max = 0;
        int[][] dp = new int[A.length + 1][B.length + 1];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                     max = Math.max(max, dp[i + 1][j + 1]);
                }
            }
        }
        return max;
    }

}
