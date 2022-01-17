package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays_1630 {

	public static void main(String[] args) {
		/*int nums[] = {4,6,5,9,3,7};
		int l[] = {0, 0, 2};
		int r[] = {2, 3, 5};*/
		
		int nums[] = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
		int l[] = {0,1,6,4,8,7};
		int r[] = {4,4,9,7,9,10};
		
		System.out.println(checkArithmeticSubarrays(nums, l, r));
	}
	
	
	public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
		List<Boolean> result = new ArrayList<>();
		
		for(int i=0; i<l.length; i++) {
			int lIndex = l[i];
			int rIndex = r[i];
			
			int arr[] = new int[rIndex-lIndex+1];
			System.arraycopy(nums, lIndex, arr, 0, arr.length);
			
			checkArithmeticSubarray(arr, result);
		}
		
		return result;
    }


	private static void checkArithmeticSubarray(int[] arr, List<Boolean> result) {
		Arrays.sort(arr);
		boolean flag = true;
		
		int diff = arr[1]-arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] - arr[i-1] != diff) {
				flag = false;
				break;
			}
		}
		
		result.add(flag);
	}

}
