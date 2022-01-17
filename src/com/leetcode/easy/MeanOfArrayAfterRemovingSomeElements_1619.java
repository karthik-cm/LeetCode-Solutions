package com.leetcode.easy;

import java.util.Arrays;

public class MeanOfArrayAfterRemovingSomeElements_1619 {

	public static void main(String[] args) {
		// int[] arr = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
		int[] arr = {6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
		
		System.out.println(trimMean(arr));
	}
	
	
	public static double trimMean(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		
		int remove = (int) (0.05 * len);
		int start = 0 + remove;
		int end = len - 1 - remove;
		
		System.out.println("len="+len +", remove="+remove +", start="+start +", end="+end);
		
		double sum = 0;
		double count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(i >= start && i <= end) {
				sum += arr[i];
				count++;
			}
		}
		
		System.out.println("sum="+sum +", count="+count);
		return sum/count;
    }

}
