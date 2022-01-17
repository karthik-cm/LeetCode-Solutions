package com.leetcode.easy;

import java.util.Arrays;

public class FindGreatestCommonDivisorOfArray_1979 {

	public static void main(String[] args) {
		
	}
	
	
	public int findGCD(int[] nums) {
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        return gcd(min, max);
    }
    
    private int gcd(int x, int y){
        int gcd = 1;
        
        for(int i=2; i<=x && i<=y; i++){
            if(x%i == 0 && y%i == 0){
                gcd = i;
            }
        }
        
        return gcd;
    }

}
