package com.leetcode.easy;

import java.util.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,4,3,2,1};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(shuffle(a, a.length)));
	}
	
	public static int[] shuffle(int[] nums, int n) {
        int[] shuffleArray = new int[nums.length];
        int count = 0;
        
        for(int i=0; i<=nums.length/2-1; i++) {
        	shuffleArray[count] = nums[i];
        	count++;
        	shuffleArray[count] = nums[i+nums.length/2];
        	count++;
        }
        
        return shuffleArray;
    }

}
