package com.leetcode.medium;

public class Searcha2dMatrix_74 {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int target = 3;
		
		System.out.println(binarySearch(arr, target));
	}
	
	
	// Binary Search Approach - Elements are in sorted manner + target is given
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0) {
			return false;
		}
		
		for(int[] arr : matrix) {
			if(binarySearch(arr, target) != -1) {
				return true;
			}
		}
		
		return false;
    }

	
	private static int binarySearch(int arr[], int target) {
		int index = -1;
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low <= high) {
			int mid = (low + high) / 2;
			
			if(arr[mid] == target) {
				return mid;
			}
			else if(target < arr[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return index;
	}
}
