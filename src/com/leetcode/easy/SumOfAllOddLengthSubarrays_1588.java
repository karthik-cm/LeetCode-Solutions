package com.leetcode.easy;

public class SumOfAllOddLengthSubarrays_1588 {

	public static void main(String[] args) {
		int arr[] = {1,4,2,5,3};
		
		System.out.println(sumOddLengthSubarrays(arr));
	}
	
	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if((i + j + 1) % 2 != 0) {
					sum += getSum(arr, i, j+1);
				}
			}
		}
		
		return sum;
    }
	
	private static int getSum(int arr[], int start, int end) {
		int sum = 0;
		for(int i=start; i<end; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
