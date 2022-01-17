package com.leetcode.easy;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence_1502 {

	public static void main(String[] args) {
		int[] arr = {3, 5, 1, 7};
		
		System.out.println(canMakeArithmeticProgression(arr));
	}
	
	
	public static boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		
		int a = arr[0];
		int d = arr[1] - a;
		
		int prev = a;
		for(int i=1; i<arr.length; i++) {
			int curr = arr[i];
			
			if(curr - prev != d) {
				return false;
			}
			
			prev = curr;
		}
		
		return true;
    }

}
