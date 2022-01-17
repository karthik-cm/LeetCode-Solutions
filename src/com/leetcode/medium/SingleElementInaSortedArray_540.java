package com.leetcode.medium;

public class SingleElementInaSortedArray_540 {

	public static void main(String[] args) {
		int nums[] = {1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(nums));
		
		System.out.println("2^3 = "+(2^3));
		System.out.println("3^2 = "+(3^2));
	}
	
	
	// XOR
	// a) XOR of a number with itself is 0
	// b) XOR of a number with 0 is the number itself
	// 4 ^ 4 = 0
	// 4 ^ 0 = 4
	
	
	// Time - O(n), Space - O(1)
	// https://leetcode.com/problems/single-element-in-a-sorted-array/discuss/1173825/Java-Solution-using-XOR-(-Time-O(n)-Space-O(1))
	public static int singleNonDuplicate(int[] nums) {
		int ans = nums[0];
        
        for(int i=1; i<nums.length; i++){
            ans = ans ^ nums[i];
            System.out.print(ans+",");
        }
        System.out.println();
        
        return ans;
    }

}
