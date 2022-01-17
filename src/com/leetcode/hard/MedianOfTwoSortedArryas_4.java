package com.leetcode.hard;

import java.text.DecimalFormat;
import java.util.Arrays;

public class MedianOfTwoSortedArryas_4 {

	public static void main(String[] args) {
		int[] nums1 = {2,2,2,2};
		int[] nums2 = {2,2,2};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = 0.0d;
		
		int nums3[] = new int[nums1.length+nums2.length];
		int num3Len = nums3.length;
		int index = 0;
		
		for(int i : nums1) {
			nums3[index] = i;
			index++;
		}
		
		for(int i : nums2) {
			nums3[index] = i;
			index++;
		}
		
		Arrays.sort(nums3);
		DecimalFormat df = new DecimalFormat("#.00000");
		
		if(num3Len == 1) {
			median = (double) nums3[0];
		}
		else if(num3Len == 2) {
			median = (double) (nums3[0] + nums3[1]) / 2;
		}
		else {
			int quotient = num3Len / 2;
			if(num3Len % 2 == 0) {
				median = (double) (nums3[quotient-1] + nums3[quotient]) / 2;
			}
			else{
				median = (double) nums3[quotient];
			}
		}
		
		median = Double.valueOf(df.format(median));
		
		return median;
    }
}
