package com.leetcode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		productExceptSelf(nums);
	}
	
	
	public static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
        int[] output = new int[n];
        
        output[0] = 1;
        // Storing left values in output itself
        for(int i=1; i<n; i++){
            output[i] = nums[i-1] * output[i-1];
        }
        
        System.out.println("After left  : "+Arrays.toString(output));
        
        // Calculating right value in output
        int right = 1;
        for(int i=n-1; i>=0; i--){
            output[i] = output[i] * right;
            right = right * nums[i];
        }
        
        System.out.println("After Right : "+Arrays.toString(output));
        
        return output;
    }

}
