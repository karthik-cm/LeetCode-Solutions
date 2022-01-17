package com.leetcode.medium;

public class HouseRobber_198 {

	public static void main(String[] args) {
		int nums[] = {2,7,9,3,1};
		System.out.println(rob(nums));
	}
	
	public static int rob(int[] nums) {
		int rob = 0, noRob = 0;
		for(int num : nums){
			int temp = rob;
			rob = Math.max(noRob + num, rob);
			noRob = temp;
        }
        return rob;
    }

}
