package com.leetcode.medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {

	// IMP
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}
	
	
	public static int[] productExceptSelf(int[] nums) {
	    int N = nums.length;
	    int output_arr[] = new int[N];
	    
	    output_arr[0] = 1;
	    for(int i=1; i<N; i++) {
	    	output_arr[i] = output_arr[i-1] * nums[i-1];
	    }
	    
	    int R = 1;
	    for(int i=N-1; i>=0; i--) {
	    	output_arr[i] = output_arr[i] * R;
	    	R = R * nums[i];
	    }
	    
	    return output_arr;
	}
	
	
	
	/*public static int[] productExceptSelf(int[] nums) {
	    int N = nums.length;
	    
	    int left_products[] = new int[N];
	    int right_products[] = new int[N];
	    
	    int output_arr[] = new int[N];
	    
	    
	    left_products[0] = 1;
	    right_products[N-1] = 1;
	    
	    for(int i=1; i<N; i++) {
	    	left_products[i] = nums[i-1] * left_products[i-1];
	    }
	    
	    for(int i=N-2; i>=0; i--) {
	    	right_products[i] = nums[i+1] * right_products[i+1];
	    }
	    
	    
	    for(int i=0; i<N; i++) {
	    	output_arr[i] = left_products[i] * right_products[i];
	    }
	    
	    return output_arr;
	}*/
	

}
