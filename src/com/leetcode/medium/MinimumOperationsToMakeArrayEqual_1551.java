package com.leetcode.medium;

public class MinimumOperationsToMakeArrayEqual_1551 {

	public static void main(String[] args) {
		// int arr[] = {1,3,5,7,9};
		
		System.out.println(minOperations(6));
	}
	
	
	public static int minOperations(int n) {
		if(n > 0) {
			int count = 0;
			// int arr[] = generateArray(n);
			int left = 0;
			int right = n-1;
			
			while(left < right) {
				int leftValue = (2*left) - 1;
				int rightValue = (2*right) - 1;
				
				count += (rightValue - leftValue) / 2;
				
				left++;
				right--;
			}
			
			return count;
		}
		
		return 0;
    }
	
	/*private static int[] generateArray(int n) {
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = (2 * i) + 1;
		}
		return arr;
	}
	
	private static int getMedian(int arr[]) {
		int len = arr.length;
		
		if(len % 2 == 1) {
			return arr[len/2];
		}
		else {
			return (arr[len/2] + arr[(len/2)-1]) / 2;
		}
	}*/

}
